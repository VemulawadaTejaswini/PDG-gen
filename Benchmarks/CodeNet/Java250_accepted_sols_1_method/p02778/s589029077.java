import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
	  String str = scan.next();      
      int count = str.length();

      for(int i =0; i < count; i++){
		System.out.print("x");
      }
      
    }
}