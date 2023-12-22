import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int X = sc.nextInt();
      int t = sc.nextInt();
      System.out.println(((X - t) > 0) ? (X - t) : 0);
	}
}
