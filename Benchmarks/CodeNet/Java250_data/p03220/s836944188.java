import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),T=sc.nextInt(),A=sc.nextInt(),ans=0;
        double min = Double.MAX_VALUE;
        for(int i=0;i<N;i++){
            int a =sc.nextInt();
            double b =Math.abs(A-(T-a*0.006));
            if(b<min){
                ans=i;min=b;
            }
        }
        System.out.println(ans+1);
    }
}