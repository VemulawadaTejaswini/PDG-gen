import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      System.out.println(tmp.substring(0,1) + (tmp.length() - 2) + tmp.substring(tmp.length() - 1,tmp.length()));
	}
}
