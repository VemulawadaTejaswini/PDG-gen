import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String C = sc.next();
      String alfa = "abcdefghijklmnopqrstuvwxyz";
      int A = alfa.indexOf(C);
      System.out.println(alfa.substring(A+1,A+2));
    }
}