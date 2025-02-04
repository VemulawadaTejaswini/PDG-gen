import java.util.*;
class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = stdIn.nextInt();
        }
        for(int i = 0; i < n; i++) {
            y[i] = stdIn.nextInt();
        }
        for(int p = 1; p <= 3; p++) {
            double dis = 0.0;
            for(int i = 0; i < n; i++) {
                dis += Math.pow(Math.abs(x[i] - y[i]),p);
            }
            System.out.println(Math.pow(dis, 1.0/p));
        }
        int max = 0;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, Math.abs(x[i] - y[i]));
        }
        System.out.println(max);
         
    }
}
