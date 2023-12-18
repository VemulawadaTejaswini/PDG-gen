import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      long a = in.nextLong();
      int b = 0;
      int zero = 0;
      int over = -1;
      long prod = 1;
      
      for(int i=0;i<n-1; i++){
        if(a<=1000000000000000000/prod){
          System.out.println(over);
        }else{
          b = in.nextInt();
       	  a = a*b;
        }
      }
      System.out.println(a);
    }
}