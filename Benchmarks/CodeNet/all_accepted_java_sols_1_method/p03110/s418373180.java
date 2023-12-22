import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] x = new Double[n];
        String[] u = new String[n];
        for(int i = 0 ; i < n ; i++ ){
            x[i] = sc.nextDouble();
            u[i] = sc.next();
            if(u[i].equals("BTC")){
                x[i] *= 380000;
            }
            if(i != 0){
                x[0] += x[i];
            }
        }
        System.out.println(x[0]);
        sc.close();
    }
}