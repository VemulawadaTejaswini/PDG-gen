import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      
      
      String S1 = "AAA";
      String S2 = "BBB";
      
      if(S.equals(S1)){
      System.out.println("No");
      }
      else if(S.equals(S2)){
      System.out.println("No");
      }
      else{
        System.out.println("Yes");
      }
    }
}