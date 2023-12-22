import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long A = sc.nextLong();
      String b = sc.next();
      String B = b.substring(0,1)+b.substring(2,4);
      int C =Integer.parseInt(B);
      long D = A*C;
      System.out.println(D/100);
	}
}