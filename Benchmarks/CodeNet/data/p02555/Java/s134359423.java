import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s= sc.nextInt();
        long div=1_000_000_007;
        long[]ans=new long[s+1];
        
        for (int i = 1; i <= s; i++) {
            if(i<=2)      ans[i]=0;
            else if(i==3) ans[i]=1;
            else          ans[i]=(((ans[i-1]+ans[i-3])%div)+div)%div;
        }
        System.out.println(ans[s]);
    }
}