import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        long[] a=new long[n];
        long ans1=0,ans2=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
        }
        long temp1=0,temp2=0;
        for (int i = 0; i <n; i++) {
            //ans1:a[0]を負とする場合
            temp1+=a[i];
            temp2+=a[i];
            if(i%2==0){
                //負にする
                if(temp1>=0) {
                    ans1 += temp1 + 1;
                    temp1 = -1;
                }
                //正にする
                if(temp2<=0) {
                    ans2 +=1-temp2;
                    temp2 = 1;
                }
            }else{
                //正にする
                if(temp1<=0){
                    ans1+=1-temp1;
                    temp1=1;
                }
                //負にする
                if(temp2>=0){
                    ans2+=1+temp2;
                    temp2=-1;
                }
            }
        }
        out.println(min(ans1,ans2));
    }
}