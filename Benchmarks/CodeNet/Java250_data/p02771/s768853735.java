import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
      	int b = scn.nextInt();
      	int c = scn.nextInt();
      	String ans = "No";
      	if((a==b&&a!=c) || (a==c&&a!=b) || (b==c&&b!=a)) ans = "Yes";
      	System.out.println(ans);
	}
}