import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int[] L = new int[N];
         int i = 0;
         int j = 0;
         int k = 0;
         int ans = 0;
    
         for(int h = 0 ; h < N ; h++){
                L[h] = sc.nextInt();
         }
         
         Arrays.sort(L);
         
         for(int fir = 0 ; fir < N ; fir++){
                i = L[fir];
                for(int sec = 0 ; sec < N ; sec++){
                    j = L[sec];
                    for(int sir = 0 ; sir < N ; sir++){
                        k = L[sir];
                        if(k > j && j > i){
                            if(k > j - i){
                                if(k < j + i){
                                    ans++;
                                }
                            }
                        }    
                }
                }
         }         
         System.out.println(ans);
    }
}