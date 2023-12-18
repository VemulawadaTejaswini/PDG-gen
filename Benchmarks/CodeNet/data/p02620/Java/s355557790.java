import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    final static XorShift rng = new XorShift(System.nanoTime());
    final static Watch watch = new Watch();
    private SAState sa = new SAState();

    private int D;
    private int[] c;
    private int[][] s;
    private int[] dayToType;
    private int score;
    private IntListSortedBIT[] last;
    private int bestScore;
    private int M;
    private int[] d2;
    private int[] q2;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        read();
        solve();
    }

    private void read() {
        try (Scanner sc = new Scanner(System.in)) {
            D = sc.nextInt();
            c = new int[26];
            for (int i = 0; i < 26; i++) {
                c[i] = sc.nextInt();
            }
            s = new int[D][26];
            for (int i = 0; i < D; i++) {
                for (int j = 0; j < 26; j++) {
                    s[i][j] = sc.nextInt();
                }
            }

            last = new IntListSortedBIT[26];
            for (int i = 0; i < last.length; i++) {
                last[i] = new IntListSortedBIT(1 << 9);
            }

            dayToType = new int[D];
            for (int day = 0; day < D; day++) {
                dayToType[day] = sc.nextInt() - 1;
                last[dayToType[day]].add(day);
            }

            score = calculateScore();

            M = sc.nextInt();
            d2 = new int[M];
            q2 = new int[M];
            for (int i = 0; i < M; i++) {
                d2[i] = sc.nextInt() - 1;
                q2[i] = sc.nextInt() - 1;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void solve() {
//        greedy();
        for (int i = 0; i < M; i++) {
            int day = d2[i];
            int type = q2[i];

            score += deltaScore(day, type);

            System.out.println(score);
        }
    }

    private int deltaScore(int day, int type) {
        int currentType = dayToType[day];

        int index = last[currentType].indexOf(day) + 1;
        int nextDay = index < last[currentType].size() ? last[currentType].get(index) - 1 : D - 1;
        last[type].add(day);
        int index2 = last[type].indexOf(day) + 1;
        int nextDay3 = index2 < last[type].size() ? last[type].get(index2) - 1 : D - 1;
        last[type].remove(day);

        int last2 = last(day, currentType);
        int last3 = last(day, type);

        int before2 = s[day][currentType];
        before2 -= (nextDay - day + 1) * (c[currentType] * ((day + 1) - last2) + c[currentType] * ((nextDay + 1) - last2)) / 2;
        before2 -= (nextDay3 - day + 1) * (c[type] * ((day + 1) - last3) + c[type] * ((nextDay3 + 1) - last3)) / 2;

        last[currentType].remove(day);
        dayToType[day] = type;
        last[type].add(day);

        last2 = last(day, currentType);
        last3 = last(day, type);

        int after2 = s[day][type];
        after2 -= (nextDay - day + 1) * (c[currentType] * ((day + 1) - last2) + c[currentType] * ((nextDay + 1) - last2)) / 2;
        after2 -= (nextDay3 - day + 1) * (c[type] * ((day + 1) - last3) + c[type] * ((nextDay3 + 1) - last3)) / 2;

        return after2 - before2;
    }

    private void greedy() {

        dayToType = new int[D];
//        if (D == 5) {
//            dayToType[0] = 1;
//            last[dayToType[0]].add(0);
//
//            dayToType[1] = 17;
//            last[dayToType[1]].add(1);
//
//            dayToType[2] = 13;
//            last[dayToType[2]].add(2);
//
//            dayToType[3] = 14;
//            last[dayToType[3]].add(3);
//
//            dayToType[4] = 13;
//            last[dayToType[4]].add(4);
//
//        } else {
//        for (int day = 0; day < dayToType.length; day++) {
//            dayToType[day] = day % 26;
//            last[dayToType[day]].add(day);
//        }
//        }

//        score = calculateScore();
//        Utils.debug("score", score);
    }

    private int calculateScore() {
        int score = 0;
        for (int day = 0; day < D; day++) {
            score += calculateScore(day);
//            System.out.println(score);
        }
        return score;
    }

    private int calculateScore(int day) {
        int score = s[day][dayToType[day]];
        for (int type = 0; type < 26; type++) {
            score -= c[type] * ((day + 1) - last(day, type));
        }
        return score;
    }

    private int last(int day, int type) {
        if (last[type].size() == 0) {
            return 0;
        }

        int index = last[type].indexOf2(day + 1) - 1;
        if (index < 0) {
            return 0;
        }
        return last[type].get(index) + 1;
    }

    private void SA() {
        double second = (int) watch.getSecond();
        sa.init();
        for (;; ++sa.numIterations) {
            if ((sa.numIterations & ((1 << 5) - 1)) == 0) {
                sa.update();

                if (sa.isTLE()) {
                    Utils.debug(sa.numIterations, String.format("%.2f%%", 100.0 * sa.validIterations / sa.numIterations), String.format("%.2f%%", 100.0 * sa.acceptIterations / sa.validIterations), String.format("%5d", score), String.format("%5d", bestScore), String.format("%.6f", 1.0 / sa.inverseTemperature), String.format("%.6f", 1.0 / sa.lastAcceptTemperature), "time", watch.getSecondString());
                    break;
                }

                if (watch.getSecond() > second) {
                    second++;
                    Utils.debug(sa.numIterations, String.format("%.2f%%", 100.0 * sa.validIterations / sa.numIterations), String.format("%.2f%%", 100.0 * sa.acceptIterations / sa.validIterations), String.format("%5d", score), String.format("%5d", bestScore), String.format("%.6f", 1.0 / sa.inverseTemperature), String.format("%.6f", 1.0 / sa.lastAcceptTemperature), "time", watch.getSecondString());
                }
            }

            mutate();
        }
        Utils.debug("SA", "score", score, "time", watch.getSecondString());
    }

    private void mutate() {
        double random = 1 * rng.nextDouble();
        if (random < 1) {
            swapTwoIndex();
        }
    }

    private void swapTwoIndex() {
        int day = (int) (dayToType.length * rng.nextDouble());
        int type = (int) (26 * rng.nextDouble());

        int currentType = dayToType[day];

        int before = calculateScore(day);

        dayToType[day] = type;
        last[currentType].remove(day);
        last[type].add(day);
        int deltaScore = calculateScore(day) - before;

        if (sa.acceptB(deltaScore)) {
            score += deltaScore;
            if (Math.abs(score - calculateScore()) > 1) {
                Utils.debug(score, calculateScore());
            }
        } else {
            dayToType[day] = currentType;
            last[currentType].add(day);
            last[type].remove(day);
        }
    }

    private void write() {
        StringBuilder sb = new StringBuilder();
        for (int day = 0; day < D; day++) {
            sb.append((dayToType[day] + 1) + "\n");
        }
        System.out.print(sb.toString());
        System.out.flush();
    }

}

class CollectionsUtils {
    private CollectionsUtils() {
    }

    public static final <T> void shuffle(ArrayList<T> list, Random rng) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int j = (int) ((i + 1) * rng.nextDouble());
            CollectionsUtils.swap(list, i, j);
        }
    }

    public static final <T> void shuffle(ArrayList<T> list, XorShift rng) {
        for (int i = list.size() - 1; i >= 0; i--) {
            int j = (int) ((i + 1) * rng.nextDouble());
            CollectionsUtils.swap(list, i, j);
        }
    }

    public static final <T> void select0(ArrayList<T> a, int l, int r, int k, Comparator<T> comparator) {
        while (l < r) {
            int i = CollectionsUtils.partition3(a, l, r, comparator);
            if (i >= k)
                r = i - 1;
            if (i <= k)
                l = i + 1;
        }
    }

    public static final <T> void select(ArrayList<T> a, int startInclusive, int endExclusive, int k, Comparator<T> comparator) {
        select0(a, startInclusive, endExclusive - 1, k, comparator);
    }

    public static final <T extends Comparable<T>> void select0(ArrayList<T> a, int l, int r, int k) {
        while (l < r) {
            int i = CollectionsUtils.partition3(a, l, r);
            if (i >= k)
                r = i - 1;
            if (i <= k)
                l = i + 1;
        }
    }

    public static final <T extends Comparable<T>> void select(ArrayList<T> a, int startInclusive, int endExclusive, int k) {
        select0(a, startInclusive, endExclusive - 1, k);
    }

    public static final <T> void swap(ArrayList<T> a, int i, int j) {
        T swap = a.set(i, a.get(j));
        a.set(j, swap);
    }

    public static final <T> void sort3(ArrayList<T> a, int i, int j, int k, Comparator<T> comparator) {
        if (comparator.compare(a.get(i), a.get(j)) > 0) {
            swap(a, i, j);
        }
        if (comparator.compare(a.get(i), a.get(k)) > 0) {
            swap(a, i, k);
        }
        if (comparator.compare(a.get(j), a.get(k)) > 0) {
            swap(a, j, k);
        }
    }

    public static final <T extends Comparable<T>> void sort3(ArrayList<T> a, int i, int j, int k) {
        if (a.get(i).compareTo(a.get(j)) > 0) {
            swap(a, i, j);
        }
        if (a.get(i).compareTo(a.get(k)) > 0) {
            swap(a, i, k);
        }
        if (a.get(j).compareTo(a.get(k)) > 0) {
            swap(a, j, k);
        }
    }

    public static final <T> int partition3(ArrayList<T> a, int l, int r, Comparator<T> comparator) {
        int center = (l + r) >>> 1;
        sort3(a, l, center, r, comparator);
        swap(a, center, r - 1);
        if (r - l < 3) {
            return l;
        }
        int r1 = r - 1;
        T v = a.get(r1);
        int i = l - 1;
        int j = r1;
        for (;;) {
            for (; comparator.compare(a.get(++i), v) < 0;) {
            }
            for (; comparator.compare(a.get(--j), v) > 0;) {
            }
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, i, r1);
        return i;
    }

    public static final <T extends Comparable<T>> int partition3(ArrayList<T> a, int l, int r) {
        int center = (l + r) >>> 1;
        sort3(a, l, center, r);
        swap(a, center, r - 1);
        if (r - l < 3) {
            return l;
        }
        int r1 = r - 1;
        T v = a.get(r1);
        int i = l - 1;
        int j = r1;
        for (;;) {
            for (; a.get(++i).compareTo(v) < 0;) {
            }
            for (; a.get(--j).compareTo(v) > 0;) {
            }
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, i, r1);
        return i;
    }

    public static final <T extends Comparable<T>> int partition(ArrayList<T> a, int l, int r) {
        int i = l - 1, j = r;
        T v = a.get(r);
        for (;;) {
            while (a.get(++i).compareTo(v) < 0)
                ;
            while (v.compareTo(a.get(--j)) < 0)
                if (j == l)
                    break;
            if (i >= j)
                break;
            swap(a, i, j);
        }
        swap(a, i, r);
        return i;
    }

    public static final <T> void sort(ArrayList<T> a, int lInclusive, int rInclusive, Comparator<T> comparator) {
        if (lInclusive >= rInclusive) {
            return;
        }
        int k = partition3(a, lInclusive, rInclusive, comparator);
        sort(a, lInclusive, k - 1, comparator);
        sort(a, k + 1, rInclusive, comparator);
    }

    public static final <T extends Comparable<T>> void sort(ArrayList<T> a, int lInclusive, int rInclusive) {
        if (lInclusive >= rInclusive) {
            return;
        }
        int k = partition3(a, lInclusive, rInclusive);
        sort(a, lInclusive, k - 1);
        sort(a, k + 1, rInclusive);
    }

    public static final <T> ArrayList<T> reverse(ArrayList<T> list) {
        for (int l = 0, r = list.size() - 1; l < r; l++, r--) {
            list.set(r, list.set(l, list.get(r)));
        }
        return list;
    }

    public static final <T> ArrayList<T> newReverse(ArrayList<T> list) {
        ArrayList<T> res = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            res.add(list.get(i));
        }
        return res;
    }

}

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}

class Watch {
    private long start;

    public Watch() {
        init();
    }

    public double getSecond() {
        return (System.nanoTime() - start) * 1e-9;
    }

    public void init() {
        init(System.nanoTime());
    }

    private void init(long start) {
        this.start = start;
    }

    public String getSecondString() {
        return toString(getSecond());
    }

    public static final String toString(double second) {
        if (second < 60) {
            return String.format("%5.2fs", second);
        } else if (second < 60 * 60) {
            int minute = (int) (second / 60);
            return String.format("%2dm%2ds", minute, (int) (second % 60));
        } else {
            int hour = (int) (second / (60 * 60));
            int minute = (int) (second / 60);
            return String.format("%2dh%2dm%2ds", hour, minute % (60), (int) (second % 60));
        }
    }

}

class XorShift {
    private int w = 88675123;
    private int x = 123456789;
    private int y = 362436069;
    private int z = 521288629;

    public XorShift(long l) {
        x = (int) l;
    }

    public int nextInt() {
        final int t = x ^ (x << 11);
        x = y;
        y = z;
        z = w;
        w = w ^ (w >>> 19) ^ (t ^ (t >>> 8));
        return w;
    }

    public long nextLong() {
        return ((long) nextInt() << 32) ^ (long) nextInt();
    }

    public double nextDouble() {
        return (nextInt() >>> 1) * 4.6566128730773926E-10;
    }

    public int nextInt(int n) {
        return (int) (n * nextDouble());
    }

}

class SAState {

    public static final boolean useTime = true;

    public double startTime = 0;
    public double endTime = 9.5;
    public double time = startTime;
    public double startTemperature = 1;
    public double endTemperature = 1e-9;
    public double inverseTemperature = 1.0 / startTemperature;
    public double lastAcceptTemperature = startTemperature;

    public double startRange = 700;
    public double endRange = 1;
    public double range = startRange;

    public int numIterations;
    public int validIterations;
    public int acceptIterations;

    private static final double[] log = new double[32768];
    static {
        for (int i = 0; i < log.length; i++) {
            log[i] = Math.log((i + 0.5) / log.length);
        }
    }

    public void init() {
        numIterations = 0;
        validIterations = 0;
        acceptIterations = 0;

        startTime = useTime ? Main.watch.getSecond() : numIterations;

        update();
        lastAcceptTemperature = inverseTemperature;
    }

    public void update() {
        updateTime();
        updateTemperature();
        updateRange();
    }

    public void updateTemperature() {
        double time0to1 = elapsedPercentage(startTime, endTime, time);
        double startY = startTemperature;
        double endY = endTemperature;
        double temperature = interpolate(startY, endY, time0to1);
        inverseTemperature = 1.0 / temperature;
    }

    private double elapsedPercentage(double min, double max, double v) {
        return (v - min) / (max - min);
    }

    private double interpolate(double v0, double v1, double d0to1) {
        return v0 + (v1 - v0) * d0to1;
    }

    public void updateRange() {
        range = endRange + (startRange - endRange) * Math.pow((endTime - time) / (endTime - startTime), 1.0);
    }

    public void updateTime() {
        time = useTime ? Main.watch.getSecond() : numIterations;
    }

    public boolean isTLE() {
        return time >= endTime;
    }

    public boolean accept(double deltaScore) {
        return acceptB(deltaScore);
    }

    public boolean acceptB(double deltaScore) {
        validIterations++;

        if (deltaScore > -1e-9) {
            acceptIterations++;
            return true;
        }

        assert deltaScore < 0 : Utils.toString(deltaScore);
        assert 1.0 / inverseTemperature >= 0;

        double d = deltaScore * inverseTemperature;
        if (d < -10) {
            return false;
        }
        if (log[Main.rng.nextInt() & 32767] < d) {
            acceptIterations++;
            lastAcceptTemperature = inverseTemperature;
            return true;
        }
        return false;
    }

    public boolean acceptS(double deltaScore) {
        validIterations++;

        if (deltaScore < 1e-9) {
            acceptIterations++;
            return true;
        }

        assert deltaScore > 0;
        assert 1.0 / inverseTemperature >= 0;

        double d = -deltaScore * inverseTemperature;
        if (d < -10) {
            return false;
        }
        if (log[Main.rng.nextInt() & 32767] < d) {
            acceptIterations++;
            lastAcceptTemperature = inverseTemperature;
            return true;
        }
        return false;
    }

}

class IntListSortedBIT {
    private static final int EMPTY = -1;
    int[] sum;
    int size;

    public IntListSortedBIT(int n) {
        if (n <= 1)
            n = 2;
        n = Integer.highestOneBit(n - 1) << 1;
        sum = new int[n + 1];
    }

    public void clear() {
        Arrays.fill(sum, 0);
        size = 0;
    }

    public void add(int value) {
        add(value, 1);
    }

    private void add(int value, int number) {
        for (int j = value + 1; j < sum.length; j += j & -j) {
            sum[j] += number;
        }
        size += number;
    }

    public void remove(int value) {
        remove(value, 1);
    }

    private void remove(int value, int number) {
        number = Math.min(number, size(value));
        for (int j = value + 1; j < sum.length; j += j & -j) {
            sum[j] -= number;
        }
        size -= number;
    }

    public int get(int index) {
        int s = 0;
        for (int i = sum.length >>> 1; i > 0; i >>>= 1) {
            if (sum[s | i] <= index) {
                s |= i;
                index -= sum[s];
            }
        }
        return s;
    }

    public int indexOf(int value) {
        int s = sum(value + 1);
        int s2 = sum(value);
        if (s == s2) {
            return EMPTY;
        }
        return s2;
    }

    public int indexOf2(int value) {
//        int s = sum(value + 1);
        int s2 = sum(value);
//        if (s == s2) {
//            return EMPTY;
//        }
        return s2;
    }

    public int sum(int indexExclusive) {
        return sum1(1 + indexExclusive - 1);
    }

    private int sum1(int indexInclusive) {
        int ret = 0;
        for (int x = indexInclusive; x > 0; x -= x & -x) {
            ret += sum[x];
        }
        return ret;
    }

    public boolean contains(int value) {
        return indexOf(value) != EMPTY;
    }

    public int size() {
        return size;
    }

    public int size(int value) {
        return sum(value + 1) - sum(value);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(get(i));
        }
        sb.append("}");
        return sb.toString();
    }
}
