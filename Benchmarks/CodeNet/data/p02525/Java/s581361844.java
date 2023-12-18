import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        while(true) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }
            int sum = 0;
             
            int s[] = new int[n];
             
            for(int i = 0; i < n; i++) {
                s[i] = sc.nextInt();
                sum=sum+s[i];
            }
             
            double ave = (double)sum / n;
            double dsp = 0;
             
            for(int i = 0; i < n; i++) {
                dsp+=(double)Math.pow(s[i] - ave, 2);
            }
            dsp=dsp/n; 
             
            double sd = Math.sqrt(disp);
             
            System.out.println(sd);
        }
         
        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}