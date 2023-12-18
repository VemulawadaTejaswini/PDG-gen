import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        System.out.println(solve2(N, A, B));
    }


    private static int solve2(int N, int[] A, int[] B) {
        int count = 0;

        List<Pair> list = new ArrayList();
        for (int i=0; i<N; i++) {
            list.add(new Pair(1, A[i]));
            list.add(new Pair(-1, B[i]));
        }

        Collections.sort(list, (p1, p2) -> (int)(p1.second - p2.second));
        // for (int i=0; i<list.size(); i++) System.err.println(list.get(i));

        if (N%2 == 1) {
            int start = -1;

            int c = 0;
            int endCount = 0;
            for (int i=0; i<list.size(); i++) {
                Pair p = list.get(i);

                c += p.first;
                if (p.first < 0) endCount++;

                if (c + endCount == (N+1)/2 && start == -1) {
                    start = (int)p.second;
                    break;
                }
            }

            int end = -1;
            int startCount = 0;
            c = 0;
            for (int i=list.size()-1; i>=0; i--) {
                Pair p = list.get(i);

                c -= p.first;
                if (p.first > 0) startCount++;

                if (c + startCount == (N+1)/2 && end == -1) {
                    end = (int)p.second;
                    break;
                }
            }

            count = end - start + 1;
        } else {
            int start1 = -1;
            int end1 = -1;

            int c = 0;
            int endCount = 0;
            for (int i=0; i<list.size(); i++) {
                Pair p = list.get(i);

                c += p.first;
                if (p.first < 0) endCount++;

                if (c + endCount == N/2 && start1 == -1) {
                    start1 = (int)p.second;
                } else if (c + endCount == N/2+1 && start1 != -1) {
                    end1 = (int)p.second;
                    break;
                }
            }
            // System.err.println("start1 = " + start1 + ", end1 = " + end1);

            int start2 = -1;
            int end2 = -1;
            int startCount = 0;
            c = 0;
            for (int i=list.size()-1; i>=0; i--) {
                Pair p = list.get(i);

                c -= p.first;
                if (p.first > 0) startCount++;

                if (c + startCount == N/2 && end2 == -1) {
                    end2 = (int)p.second;

                } else if (c + startCount == N/2+1 && end2 != -1) {
                    start2 = (int)p.second;
                    break;
                }
            }
            // System.err.println("start2 = " + start2 + ", end2 = " + end2);

            count = (end1 - start1 + 1) * (end2 - start2 +1) - Math.min(end1-start1+1, end2-start2+1)+1;
        }

        return count;
    }


    /*
     * 区間が重複していれば重複数から中央値の範囲が決まると考えたが，実際は重複しない場合もあるので上手くいかない．
     * (ref: X_1: 1-10, X_2: 20-30)
     * @param N
     * @param A
     * @param B
     * @return
     */
    private static int solve(int N, int[] A, int[] B) {
        int count = 0;

        List<Pair> list = new ArrayList();
        for (int i=0; i<N; i++) {
            list.add(new Pair(1, A[i]));
            list.add(new Pair(-1, A[i]));
        }

        Collections.sort(list, (p1, p2) -> (int)(p2.second - p1.second));

        if (N%2 == 1) {
            int start = -1;
            int end = -1;
            int c = 0;
            for (int i=0; i<list.size(); i++) {
                Pair p = list.get(i);
                c += p.first;

                if (start == -1 && c == (N+1)/2) {
                    start = (int)p.second;
                } // else if (start != -1 && end == -1 && c != (N+))
            }
        } else {

        }


        return count;
    }

    public static class Pair {
        long first;
        long second;

        public Pair(long a, long b) {
            this.first = a;
            this.second = b;
        }

        public String toString() {
            return "<" + first + ", " + second + ">";
        }
    }

    class PairComparator implements Comparator {
        public int compare(Object a0, Object b0) {
            Pair a = (Pair)a0;
            Pair b = (Pair)b0;

            return (int)(b.second - a.second);
        }
    }

}