import java.util.*;
import java.io.*;

public class Main{
    static int VMAX=10000;
    public static void main (String args[]){

        //初期処理
//String配列として読みだしてintに変換する方式だとTLEがどうあがいても取れない
//ダメ→int[] array=Arrays.stream(sElementArray).mapToInt(Integer::parseInt).toArray()
//これもダメ→for文でInteger.parseInt()してint[]に変換
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int[] array=new int[n];
        for(int o = 0;o<n;o++){
            array[o]=Integer.parseInt(sc.next());
        }
        sc.close();

            int[] B = new int[n+1]; //出力用
            int[] C = new int[VMAX+1]; //カウント用
            int i;

            for(i=0;i<n;i++){
                C[array[i]]++;
            }
            for(i=1;i<=VMAX;i++){
                C[i]+=C[i-1];
            }
            for(i=n-1;i>=0;i--){
                B[C[array[i]]]=array[i];
                C[array[i]]--;
            }

            StringBuffer sb=new StringBuffer();
            for(i=1;i<n;i++){
                sb.append(B[i]).append(" ");
            }
            System.out.println(sb.append(B[n]));
        }
    }
    
