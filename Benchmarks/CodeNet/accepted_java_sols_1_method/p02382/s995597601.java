import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j, k;
    	
    	 Scanner stdIn = new Scanner(System.in);
         int n = stdIn.nextInt();
         int[] x = new int[n];
  
         for (i = 0; i < n; i++) {
             x[i] = stdIn.nextInt();
         }
  
         int p1 = 0;
         double p2 = 0;
         double p3 = 0;
         int pInf = -1;
  
         for (i = 0; i < n; i++) {
             x[i] = Math.abs(x[i] - stdIn.nextInt());
             p1 += x[i];
             p2 += Math.pow(x[i],2);
             p3 += Math.pow(x[i],3);
             pInf = Math.max(pInf,x[i]);
         }
         System.out.println(p1);
         System.out.printf("%.5f\n",Math.pow(p2,0.5));
         System.out.printf("%.5f\n",Math.pow(p3,(double)1/3));
         System.out.println(pInf);
    }
}
