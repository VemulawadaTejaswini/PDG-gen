import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x=0;
		int y=0;
		int l = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		
		if(a % c != 0)	x++;
		if(b % d != 0)	y++;
		if((int)a/c >= (int)b/d)	l -= (int)(a/c)+x;
		else	l-= (int)(b/d)+y;
		System.out.println(l);

	}

}