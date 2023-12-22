import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j, k;
    	
    	while(true){
            int n = sc.nextInt();
            if(n == 0)
                break;
 
            int[] s = new int[n];
            double sum = 0;
 
            for (i = 0; i < n; i++) {
                sum += s[i] = sc.nextInt();
            }
 
            double m = sum/n;
            sum = 0;
 
            for (i = 0; i < n; i++) {
                sum += Math.pow(s[i]-m,2);
            }
            System.out.printf("%.5f\n",Math.pow((double)sum/n,0.5));
        }
    }
}
