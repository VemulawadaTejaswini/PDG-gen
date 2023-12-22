import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       long X =sc.nextLong();
      
      long total = 100;
      long a =0;
      while(total<X){
        total *=1.01;
        a = a+1;
      }
      System.out.println(a);
    }
}