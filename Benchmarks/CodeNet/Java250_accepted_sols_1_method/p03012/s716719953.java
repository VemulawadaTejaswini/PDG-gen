import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	 Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] a = new int[n];
         int all = 0;
         for(int i = 0; i < n; i++) {
        	 a[i] = sc.nextInt();
        	 all += a[i];
         }
         int mae = 0;
         int ushiro = all;
         int ans = 0;
         for(int i = 0; i < n; i++) {
        	 mae += a[i];
        	 ushiro -= a[i];
        	 if(mae >= ushiro) {
        		 int ansa = Math.abs(ushiro-mae);
        		 int ansb = Math.abs(ushiro-mae+2*a[i]);
        		 ans = Math.min(ansa, ansb);
        		 break;
        	 }
         }
         System.out.println(ans);
    }
}