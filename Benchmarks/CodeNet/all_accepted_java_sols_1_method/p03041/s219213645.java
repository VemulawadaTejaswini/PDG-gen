import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
      int k = scan.nextInt();
      String s = scan.next();
      String str = s.substring(k-1, k).toLowerCase();
      s= s.substring(0,k-1) + str +s.substring(k);
		System.out.println(s);
	}
}