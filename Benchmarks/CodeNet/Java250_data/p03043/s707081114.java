import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double sum = 0;
        sc.close();
        for(int i = 1 ; i <= n ; i++){
            int a = i;
            double yono = 1;
            while(k > a){
                yono /= 2.0;
                a *= 2;
            }
            sum += yono;
        }
        System.out.println(sum / n);
    }
}
