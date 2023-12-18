import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static BigInteger[] x;
    static int[] ans;
    public static void get(){
        ans=new int[200005];
        ans[0]=0;
        for(int i=1;i<200005;i++){
            int x=i,z=0;
            while(x>0){
                if(x%2==1)z++;
                x>>=1;
            }
            ans[i]=ans[i%z]+1;
        }
    }
    public static void main(String[] args){
        get();
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String s=in.nextLine();
        x=new BigInteger[200005];
        x[0]=BigInteger.ONE;
        BigInteger y=BigInteger.ZERO;
        int count=0;
        if(s.charAt(n-1)=='1') {
            y=y.add(x[0]);
            count++;
        }
        for(int i=1;i<n;i++){
            x[i]=x[i-1].multiply(BigInteger.valueOf(2));
            if(s.charAt(n-i-1)=='1') {
                y=y.add(x[i]);
                count++;
            }
        }
        for(int i=0;i<n;i++){
            BigInteger q;
            int p=count;
            if(s.charAt(i)=='1') {
                q=y.subtract(x[n-1-i]);
                p--;
            }
            else {
                q=y.add(x[n-1-i]);
                p++;
            }
            BigInteger z=q.remainder(BigInteger.valueOf(p));
            System.out.print(ans[Integer.parseInt(z.toString())]+1);
            System.out.print('\n');
        }

    }
}
