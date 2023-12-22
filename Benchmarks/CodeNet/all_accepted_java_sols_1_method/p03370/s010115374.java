import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args){
    	 Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int max = sc.nextInt();
         int x = 1001;
         int y = 0;
         int count = 0;
         int[] d = new int[n];
         for(int i=0;i<n;i++){
            d[i]=sc.nextInt();
            x=Math.min(x,d[i]);
            y+=d[i];
         }
         System.out.println(n+(max-y)/x);
    }    
}