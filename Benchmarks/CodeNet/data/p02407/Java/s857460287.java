import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //while(true){
            int n = sc.nextInt();
            int[] x = new int[n];
            for(int i=0;i<n;i++){
                x[i] = sc.nextInt();
            }
            
            for(int i=n-1;i>0;i--){
                System.out.printf("%d ",x[i]);
            }
            System.out.printf("%d%n",x[0]);
        //}
        
        sc.close();
    }
}
