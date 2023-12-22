import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            int[] s;
            s = new int[n];
            int sum=0;
            double ave, bunsan=0.0;
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
                sum+= s[i];
            }
            ave = (double)sum/n;
            for(int j=0;j<n;j++){
                bunsan += (double)(s[j]-ave) * (s[j]-ave) / n;
            }
            System.out.println(Math.sqrt(bunsan));
        }
        sc.close();
    }
}
