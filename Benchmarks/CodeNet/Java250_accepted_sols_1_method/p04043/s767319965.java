import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	int c = scn.nextInt();
      	int count5 = 0;
      	int count7 = 0;
      	if(a==5) count5++;
      	if(a==7) count7++;
      	if(b==5) count5++;
      	if(b==7) count7++;
      	if(c==5) count5++;
      	if(c==7) count7++;
      	String ans = "NO";
      	if(count5==2 && count7==1) ans = "YES";
      	System.out.println(ans);
	}
}