import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[] k = new int[n];
                int[] like = new int[m];
                Arrays.fill(like , 1);
                int[] yono = new int[m];
                for(int i = 0 ; i < n ; i++){
                        k[i] = sc.nextInt();
                        Arrays.fill(yono , 0);
                        for(int j = 0 ; j < k[i] ; j++){
                                yono[sc.nextInt() - 1]++;
                        }
                        for(int ii = 0 ; ii < m ; ii++){
                                like[ii] *= yono[ii];
                        }
                }
                for(int i = 0 ; i < m ; i++){
                        if(i != 0){
                                like[0] += like[i];
                        }
                }
                System.out.println(like[0]);
        }
}//0=48
//鶏になれ