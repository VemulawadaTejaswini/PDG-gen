import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
      	int b = scn.nextInt();
      	int c = scn.nextInt();
      	String ans = "NO";
      	if(b-a==c-b) ans = "YES";
      	System.out.println(ans);
	}
}