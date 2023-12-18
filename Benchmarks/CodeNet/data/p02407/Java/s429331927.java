import java.util.Scanner;
public class Main{
    public static void main(String args[]){
      int n,i;
      int[] a;
      a = new int[100];
      
      Scanner scan = new Scanner(System.in);
      n = scan.nextInt();
      for(i=0;i<n;i++){
          a[i] = scan.nextInt();
      }

      for(i=n-1;i>0;i--){
          System.out.print(a[i]+" ");
      }
      System.out.println(""+a[0]);
      
    }
    
}
