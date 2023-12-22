

import java.util.Scanner;

public class Main {
    static class Solution {
        public void find() {

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double min = (double)sum/(4*m);
        int count =0;
        for(int i=0; i<n; i++) {
            if(arr[i] >= min) {
                count++;
            }
        }
        System.out.println(count>=m ? "Yes" : "No");
    }
}
