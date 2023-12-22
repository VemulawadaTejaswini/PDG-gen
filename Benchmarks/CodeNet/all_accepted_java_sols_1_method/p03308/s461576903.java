import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        int sabun = 0;

        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                sabun = Math.abs(a[i]-a[j]);
                if(max<sabun){
                    max = sabun;
                }
            }
        }
        System.out.println(max);

    }
}
