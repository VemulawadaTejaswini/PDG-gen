import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String [] args){
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		int fiv=0,sev=0;
		if(a==5)fiv++;
		if(a==7)sev++;
		if(b==5)fiv++;
		if(b==7)sev++;
		if(c==5)fiv++;
		if(c==7)sev++;
		if(fiv==2&&sev==1)System.out.println("YES");
		else System.out.println("NO");
	}
}