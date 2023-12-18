import java.util.*;

public class Main{

     public static void main(String []args){

         int[] k = new int[101];
        for(int i = 1; i < 101; i++){
            k[i] = 0;
        }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        int b;
        for(int i = 0; i<a; i++){
            b = sc.nextInt();
            k[b]++;
        }
        
        for(int j = 1; j< 101; j++){
            if(k[j] != 0)
            cnt++;
        }
        System.out.println(cnt);
     }
}