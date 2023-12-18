import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Az = new int[N];
        int[] sortedAz = new int[N];
        for (int i = 0; i < N; i++) {
            Az[i] = sc.nextInt();
        }
        Arrays.sort(Az);
        int sum = 0;
        for (int i = N - 1; i >= 0; i--) {
//            sum += Az[i];
            sortedAz[N - i - 1] = Az[i];
        }
//        for (int i = 0; i < N; i++) {
//            System.out.println(sortedAz[i]);
//        }


        for (int i = 0; i < N - 1; i++) {
            sum += sortedAz[(i + 1) / 2];
        }
        System.out.println(sum);

//        List<Integer> vals = new ArrayList<Integer>();
//        List<Integer> diffs = new ArrayList<Integer>();
//        for (int i = 0; i < N; i++) {
//            vals.add(Az[i]);
//            if (vals.size() == 0){
//                diffs.add(Az[i]);
//            } else {
//
//            }
//
//        }

    }
}
