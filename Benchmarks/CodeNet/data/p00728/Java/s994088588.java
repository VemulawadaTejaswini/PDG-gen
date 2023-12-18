import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            int max=0;
            int min=10000;
            int j=0;
            int k=0;
            int ave;
            int sum=0;
            int[] s = new int[n];
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
                if(s[i]>=max){
                    max=s[i];
                    j=i;
                }
                if(s[i]<=min){
                    min=s[i];
                    k=i;
                }
            }
            for(int i=0;i<n;i++){
                if(i==j||i==k) sum-=s[i];
                sum += s[i];
            }
            ave = (int)(sum/(n-2));
            System.out.println(ave);
        }
    }
}
