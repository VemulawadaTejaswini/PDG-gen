import java.util.Scanner;
public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n==0) break; 
            double sum=0.0;
            double x=0.0;
            double a,m,y;
            int[] s = new int[n];
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
                sum += s[i];
            }
            m = sum/n;
            for(int i=0;i<n;i++){
                x += Math.pow(s[i]-m,2);
            }
            y = x/n;
            a = Math.sqrt(y);
            System.out.println(a);
        }
    }
}
