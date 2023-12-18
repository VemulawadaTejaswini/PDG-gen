import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                double[] a = new double[n];
                for(int i = 0 ; i < n ; i++){
                        a[i] = sc.nextDouble();
                }
                int yono = 0;
                sc.close();
                for(int i = 0 ; i < n ; i++){
                        for(int j = 0 ; j < i ; j++){
                                if(a[i] * a[j] % 1 == 0) yono++;
                        }
                }
                System.out.println(yono);
        }
}//0=48
 //a=97 a -> +26 = 123
//鶏になれ