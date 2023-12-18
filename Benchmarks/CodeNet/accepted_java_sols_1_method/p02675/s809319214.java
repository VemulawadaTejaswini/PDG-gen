import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = n%10;
      	String ans = "";
      	if(a==2 || a==4 || a==5 || a==7 || a==9) ans="hon";
      	else if(a==0 || a==1 || a==6 || a==8) ans="pon";
      	else if(a==3) ans="bon";
      	System.out.println(ans);
	}
}