import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        Double[] h = new Double[n];
        int x = 0;
        for(int i = 0 ; i < n ; i++ ){
            h[i] = sc.nextDouble();
            h[i] = Math.abs(a - t + h[i] * 0.006);
            if(h[x] > h[i]){
                x = i;
            }
        }
        System.out.println(x + 1);
        sc.close();
    }
}
//鶏になれ