import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	         
          String X = sc.next();
      int a = X.charAt(2);
      int b = X.charAt(3);
      int c = X.charAt(4);
      int d = X.charAt(5);
      if(a==b&&c==d){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}