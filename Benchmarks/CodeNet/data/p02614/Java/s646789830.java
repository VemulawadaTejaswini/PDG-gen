import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        ArrayList<String> c = new ArrayList<String>();
        for (int i = 0; i < h; i++) {
            c.add(sc.nextLine());
        }

        String redLine = "";

        Set<Integer> hSet = new HashSet<Integer>();
        for (int i = 0; i < h; i++) {
            hSet.add(i);
        }
        Set<Integer> wSet = new HashSet<Integer>();
        for (int i = 0; i < w; i++) {
            wSet.add(i);
            redLine += "."; // in fact, this is white line;
        }

        Set<Set<Integer>> hPowSet = powerSet(hSet);
        Set<Set<Integer>> wPowSet = powerSet(wSet);

        int ans = 0;

        for (var hi : hPowSet) {
            for (var wi : wPowSet) {
                ArrayList<String> copy = new ArrayList<String>(c);
                for (var hii : hi) {
                    copy.set(hii, redLine);
                }
                for (var wii : wi) {
                    for (int j = 0; j < h; j++) {
                        StringBuilder builder = new StringBuilder(copy.get(j));
                        builder.setCharAt(wii, '.');
                        copy.set(j, builder.toString());
                    }
                }
                // count #
                int count = 0;
                for (var str : copy)
                    for (int j = 0; j < str.length(); j++)
                        if (str.charAt(j) == '#')
                            count += 1;

                if (count == k)
                    ans += 1;
            }
        }
        System.out.println(ans);
    }

    public static <T> Set<Set<T>> powerSet(Set<T> originalSet) {
        Set<Set<T>> sets = new HashSet<Set<T>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<T>());
            return sets;
        }
        List<T> list = new ArrayList<T>(originalSet);
        T head = list.get(0);
        Set<T> rest = new HashSet<T>(list.subList(1, list.size()));
        for (Set<T> set : powerSet(rest)) {
            Set<T> newSet = new HashSet<T>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
}