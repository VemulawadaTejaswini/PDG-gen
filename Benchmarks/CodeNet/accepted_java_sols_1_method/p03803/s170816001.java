import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	if(a==1) a+=13;
      	if(b==1) b+=13;
      	String ans = "Draw";
      	if(a>b) ans = "Alice";
      	if(a<b) ans = "Bob";
      	System.out.println(ans);
	}
}