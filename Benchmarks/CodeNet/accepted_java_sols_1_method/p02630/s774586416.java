import java.nio.Buffer;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static Scanner r=new Scanner(System.in);
    public static void main(String[] args) {
        int n=r.nextInt();
        long sum=0;
        long []cnt=new long[100005];
        for(int i=0;i<n;++i){
            int x=r.nextInt();
            ++cnt[x];
            sum+=x;
        }
        int q=r.nextInt();
        while(q-->0){
            int b=r.nextInt();
            int c=r.nextInt();
            long num=cnt[b];
            cnt[b]=0;
            cnt[c]+=num;
            sum=sum-num*b+num*c;
            System.out.println(sum);
        }
    }
}
