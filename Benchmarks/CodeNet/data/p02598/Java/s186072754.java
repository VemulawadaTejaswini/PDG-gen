import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        int left = 0;
        int right = (int)1e9+100;

        while (left<right) {
            int mid = (left+right) / 2;
            long cnt = 0;
            for (int i=0; i<n; i++) {
                cnt += (arr[i] - 1) / mid;
            }
            if (k < cnt) {
                left = mid+1;
            } else {
                right = mid;
            }
//            System.out.println(left);
        }

        System.out.println(left);
    }

    public static int lowerbound1(int[] arr, int value){
        int left = 0;
        int right = arr.length;
        while (left<right){
            int mid = (left+right)/2;
            if (arr[mid]<value){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return left;
    }


}

