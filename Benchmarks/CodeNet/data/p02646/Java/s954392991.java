import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int v = scn.nextInt();
      	int b = scn.nextInt();
      	int w = scn.nextInt();
      	int t = scn.nextInt();
      	double tt;
      	String ans = "YES";
      	if(b>a) tt = (double)(b-a)/(v-w);
      	if(a>b) tt = (double)(a-b)/(v-w);
        if(t<tt) ans = "NO";
        if(w>v) ans = "NO";
      	System.out.println(ans);
	}
}
