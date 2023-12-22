import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();

        int[] h = new int[n];

        int count = 0;

        for(int i = 0;i < n;i++) {
            h[i] = stdIn.nextInt();
        }

        for(int i = 0;i < n;i++) {
            if(h[i] >= k) {
                count++;
            }
        }
        

       System.out.println(count);
    }

}