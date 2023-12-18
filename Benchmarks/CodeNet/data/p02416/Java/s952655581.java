import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static String a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            a=sc.next();
            if(a.equals("0")){
                sc.close();
                return;
            }
            int len=a.length();
            int ans=0;
            for(int i=0;i<len;i++){
                int b=a.charAt(i)-'0';
                ans+=b;
            }
            System.out.printf("%d\n",ans);
        }
    }
    public static long sumDigits(long n) {
        long sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
