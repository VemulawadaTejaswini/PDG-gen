import java.util.Scanner;

public class Main{
    static double e = 1e-8;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int N=sc.nextInt();
            int M=sc.nextInt();
            int P=sc.nextInt();
            if(N+M+P==0)break;
            int[] a = new int[N];
            double sum=0;
            int s = 0;
            for (int i = 0; i < N; i++) {
                a[i]=sc.nextInt();
                sum+=a[i];
                s+=a[i];
            }
            if(a[M-1]==0){
                System.out.println(0);
                continue;
            }
            sum*=100;
            sum=sum*(100-P)/100.0;
            sum+=e;
            sum = sum/a[M-1];
            int ans = (int)(sum+e);
            System.out.println(ans);
            
        }
    }

}