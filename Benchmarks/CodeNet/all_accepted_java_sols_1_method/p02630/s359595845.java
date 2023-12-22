import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Az = new int[N];
        for (int i = 0; i < N; i++){
            Az[i] = sc.nextInt();
//            System.out.println(Az[i]);
        }
//        System.out.println("rr");
        int Q = sc.nextInt();
        int[] Bz = new int[Q + 1];
        int[] Cz = new int[Q + 1];
        for (int i = 0; i < Q; i++){
            Bz[i] = sc.nextInt();
            Cz[i] = sc.nextInt();
        }

        Arrays.sort(Az);
        long sumA = 0;
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] nums = new int[1000001];
//        System.out.println("a");
        for (int i = 0; i < N; i++){
//            System.out.println(Az[i]);
            sumA += Az[i];
            nums[Az[i]]++;
        }
//        System.out.println("b");

        int changeNumCnt = 0;
//        int left = 0; int right = Az.length();
//        int mid = 0;
        int diff = 0;
//        System.out.println("sumA "+sumA);
        for (int i = 0; i < Q; i++){
            changeNumCnt = nums[Bz[i]];
            nums[Bz[i]] = 0;
            nums[Cz[i]] += changeNumCnt;
            diff = Cz[i] - Bz[i];
            sumA = sumA + (diff * changeNumCnt);
            System.out.println(sumA);
        }


    }
}