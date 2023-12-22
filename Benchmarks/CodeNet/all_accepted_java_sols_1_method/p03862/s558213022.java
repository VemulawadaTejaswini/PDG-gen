
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long x=sc.nextLong();
        long a[] = new long[n];
        for(int i=0;i<n;i++)a[i]=sc.nextLong();
        long ans =0;

        for(int i=1;i<n;i++){
            long total = a[i-1]+a[i];
            if(total>x){
                long dif = total -x;
                ans+=dif;

                if(a[i]>dif)a[i]-=dif;
                else {
                    a[i-1]-=dif-a[i];
                    a[i]=0;
                }
            }
        }

        System.out.println(ans);

    }
}
