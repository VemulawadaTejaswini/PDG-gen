import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N=sc.nextInt();
        int[] a =new int[N];
        double sum=0;
        double ave=0;
        double d=0;
        double ans=100000000;
        int result=0;
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        ave = sum/N;
        for(int i=0;i<N;i++){
            d=Math.abs(ave-a[i]);
            if(ans>d){
                ans =d;
                result=i;
            }
        }
        System.out.println(result);
    }
}
