import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = 0;
        int N = 0;
        X = scanner.nextInt();
        N = scanner.nextInt();
        if (N != 0) {
            int[] suuretu = new int[N];
            for (int i = 0; i < N; i++) {
                suuretu[i] = scanner.nextInt();
            }
            Arrays.sort(suuretu);
//            System.out.println("  " +suuretu[N - 1] + " " + suuretu[0]);

            int[] junban = new int[suuretu[N - 1] - suuretu[0] + 3];
            int index = 0;
            for (int i = suuretu[0] - 1; i <= suuretu[N - 1] + 1; i++) {
                junban[index] = i;
//                System.out.println("  " + i);
                index++;
            }

            List<Integer> suuretuList = toList(suuretu);
            List<Integer> junbanList = toList(junban);
            junbanList.removeAll(suuretuList);
            List<Integer> sabunList = new ArrayList<>();
            List<Integer> sabunAtaiList = new ArrayList<>();
            for (Integer info : junbanList) {
//                System.out.println(info);
                sabunList.add(Math.abs(info - X));
                sabunAtaiList.add(info);
            }
            Object[] sabun = sabunList.toArray();
            Object[] sabunAtai = sabunAtaiList.toArray();


//            if (sabunList.size() > 0) {
                int intMin = (int) sabun[0];
                int minIndex = 0;
                for (int i = 1; i < sabun.length; i++) {

                    if (intMin > (int) sabun[i]) {
                        intMin = (int) sabun[i];
                        minIndex = i;
                    }
                }
                System.out.println(sabunAtai[minIndex]);
//            } else {
//
//                System.out.println(X);
//            }

        } else {

            System.out.println(X);
        }


    }

    public static ArrayList<Integer> toList(int[] arr){
        // int[] -> ArrayList<Integer>
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int t : arr) list.add(t);
        return list;
    }
}
