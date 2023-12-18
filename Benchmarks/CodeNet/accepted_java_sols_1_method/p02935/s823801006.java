import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double[] ans=new double[n];
        for(int i=0;i<n;i++){
            ans[i]=sc.nextInt();
        }
        Arrays.sort(ans);
        for(int i=0;i<n-1;i++){
            ans[i+1]=(ans[i]+ans[i+1])/2;
        }
        System.out.println(ans[n-1]);
    }
    
    
}