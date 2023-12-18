import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            String S = in.next();
            S += '-';
            char[] cs = S.toCharArray();

            int max = 0;
            int sum = 0;
            int size0 = 0;
            LinkedList<Integer> l = new LinkedList<>();
            for (int i = 0, count1 = 0, count0 = 0; i < cs.length; i++) {
                if (cs[i] == '0') {
                    count0++;
                    if (count1 > 0) {
                        l.add(count1);
                        sum += count1;
                        count1 = 0;
                        max = Math.max(max, sum);
//                        Utils.debug(i, max, sum);
                    }
                } else if (cs[i] == '1') {
                    count1++;
                    if (count0 > 0) {
                        l.add(count0);
                        size0++;
                        sum += count0;
                        count0 = 0;
                        if (size0 > K) {
                            if (l.size() % 2 == 0) {
                                int count12 = l.pollFirst();
                                sum -= count12;
                                int count02 = l.pollFirst();
                                sum -= count02;
                            } else {
                                int count02 = l.pollFirst();
                                sum -= count02;
                            }
                            size0--;
                        }
                        max = Math.max(max, sum);
//                        Utils.debug(i, max, sum);
                    }
                } else {
                    if (count1 > 0) {
                        l.add(count1);
                        sum += count1;
                        count1 = 0;
                        max = Math.max(max, sum);
//                        Utils.debug(i, max, sum);
                    }
                    if (count0 > 0) {
                        l.add(count0);
                        size0++;
                        sum += count0;
                        count0 = 0;
                        if (size0 > K) {
                            if (l.size() % 2 == 0) {
                                int count12 = l.pollFirst();
                                sum -= count12;
                                int count02 = l.pollFirst();
                                sum -= count02;
                            } else {
                                int count02 = l.pollFirst();
                                sum -= count02;
                            }
                            size0--;
                        }
                        max = Math.max(max, sum);
//                        Utils.debug(i, max, sum);
                    }
                }
            }

            System.out.println(max);

        }
    }
}
