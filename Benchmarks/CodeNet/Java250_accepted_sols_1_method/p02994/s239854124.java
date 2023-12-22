import java.util.*;
import java.lang.Object;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] aji = new int[n];
        int sum = 0;
        int sabun = 99999;
        int min = 999999;
        int num = 0;

        for(int i = 0;i<n;i++){
            aji[i] = l+i;
            sum +=aji[i];
        }
        //System.out.println(sum);

        for(int i = 0;i<n;i++){
            sabun = Math.abs(sum - (sum - aji[i]));
            if(min>sabun){
                min = sabun;
                num = i;
            }
        }
        //System.out.println(min);
        System.out.println(sum-aji[num]);

    }
}
