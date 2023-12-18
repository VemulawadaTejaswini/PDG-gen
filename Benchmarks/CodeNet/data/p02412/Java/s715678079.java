import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int a,b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0&&b==0){
                sc.close();
                return;
            }
            int ans=0;
            for(int i=1;i<=a;i++){
                for(int j=i+1;j<=a;j++){
                    for(int k=j+1;k<=a;k++){
                        if(i+j+k==b) ans++;
                    }
                }
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
