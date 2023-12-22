import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n  = sc.nextInt();
         int a[] = new int[n];
         for(int i= 0; i<n ; i++){
                 a[i] = sc.nextInt();
         }
         double j = 0.0;
         for(int i= 0 ; i<n ; i++){
             j += (double)1/a[i];
         }
         System.out.println(1/j);
         
    }
}
