import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class cf {
    public static Scanner r=new Scanner(System.in);
    public static void main(String[] args) {
        int n=r.nextInt();
        int sum=0;
        int cur=0;
        for(int i=1;i<=n;++i){
            cur+=i;
            sum+=cur;
        }
        for(int i=0;i<n-1;++i){
            int x,y;
            x=r.nextInt()-1;
            y=r.nextInt()-1;
            int a=Math.min(x,y);
            int b=Math.max(x,y);
            sum-=(a+1)*(n-b);
        }
        System.out.println(sum);
    }
}
