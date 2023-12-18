import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        long[] x = new long[n];
        long[] y = new long[n];
        int yono = 0;
        for(int i = 0 ; i < n ;i++){
            x[i]= sc.nextLong();
            y[i] = sc.nextLong();
            if(d * d >= x[i] * x[i] + y[i] * y[i]){
                yono++;
            }
        }
        sc.close();
        System.out.println(yono);
    }
}