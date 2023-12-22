import java.util.*;
import java.lang.Object;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] num = new int[n+1];
        num[0] = 0;
        int cnt = 0;

        for(int i = 1;i<n+1;i++){
            int l = sc.nextInt();
            num[i]+=num[i-1]+l;
          //  System.out.println(num[i]);
        }

        for(int i = 0;i<n+1;i++){
            if(num[i]<=x){
                cnt++;
            }
        }
        System.out.println(cnt);

        


    }
}
