import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        
        int ans=0;
        
        int sum;
        for(int i=1;i<=N;i++){
            sum=(i/10000)+(i/1000%10)+(i/100%10)+(i/10%10)+(i%10);
            if(A<=sum&&sum<=B){
                ans+=i;
            }
        }
        
        System.out.println(ans);
    }
}