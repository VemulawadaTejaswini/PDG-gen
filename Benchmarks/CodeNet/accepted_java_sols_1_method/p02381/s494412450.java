import java.util.Scanner;
public class Main {
    public static int n;
    public static double ans,sum,ave;
    public static int[] s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        n=sc.nextInt();
        if(n==0){
            sc.close();
            return;
        }
        s=new int[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
            sum+=s[i];
        }
        ave=sum/n;
        sum=0;
        for(int i=0;i<n;i++){
            sum+=(s[i]-ave)*(s[i]-ave);
        }
        ans=Math.sqrt(sum/n);
        System.out.println(ans);
        sum=0;
        }
        
    }
}
