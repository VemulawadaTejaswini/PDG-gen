import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int ans[] = new int[10000];
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while(1){
            ans[n] = sc.nextInt();
            if(ans[n]==0)break;
            n++;
        }
        for(int i = 0;i<=n;i++){
            System.out.println("Case "+i+1+": "+ans[i]);
        }
    }
}
