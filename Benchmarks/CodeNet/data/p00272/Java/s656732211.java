import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] sell = new int[5];
        int t,n;
        int ans=0;
        for(int i=0;i<4;i++){
            t=sc.nextInt();
            n=sc.nextInt();
            sell[t]=n;
        }
        ans = 6000*sell[1]+4000*sell[2]+3000*sell[3]+2000*sell[4];
        System.out.println(ans);
    }
}