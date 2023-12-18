import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a = in.nextInt();
      int b = 0;
      
      for(int i=0;i<n-1; i++){
         b = in.nextInt();
       	 a = a*b;
      }
      System.out.println(a);
    }
}