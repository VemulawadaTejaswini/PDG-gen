import java.util.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        if(2<=t && t<=Math.pow(10,5)){
            long sum=1;
            long[] a = new long[t];
            for(int i=0;i<t;i++){
                a[i]=sc.nextLong();
            }
            for(int i=0;i<t;i++){
                sum=sum*a[i];
            }
            if(sum >= Math.pow(10,18)){
                System.out.println(-1);
            }else{
                System.out.println(sum);
            }
        }
    }
}