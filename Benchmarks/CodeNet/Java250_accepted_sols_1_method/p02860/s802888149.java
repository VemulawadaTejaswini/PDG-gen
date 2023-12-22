import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      String S =sc.next();
      
      String T =S.substring(N/2);
      
      if(S.startsWith(T) && N%2==0){
      System.out.println("Yes");
      }
      else{
       System.out.println("No");
      }
    }
}