import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n  = stdIn.nextInt();
        long  k = stdIn.nextInt();

        int[] a = new int[n];
        for(int i = 0;i < n;i++) {
            a[i] = stdIn.nextInt();
        }

        long count;
        long t = 1000000007L;

        long x = 0;
        long y = 0;
        for(int i = 0;i < n;i++) {
            for(int j = i+1;j < n;j++){
                if(a[i] > a[j]){
                    x++;
                }
            }
        }
        for(int i = 0;i < n;i++) {
            for(int j = i+1;j < n;j++){
                if(a[i] != a[j]){
                    y++;
                }
            }
        }

        if(k % 2 == 0){
            count = ((((x%t) * k) % t) + (((((y%t) * (k/2)) % t) * (k-1)) % t)) % t;
        }else {
            count = ((((x%t) * k) % t) + (((((y%t) * k) % t) * ((k-1)/2)) % t)) % t;
        }
        

        
        System.out.println(count);

        
    }

}