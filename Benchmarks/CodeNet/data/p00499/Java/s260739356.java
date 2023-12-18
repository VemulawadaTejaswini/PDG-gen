import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		
		if((int)a/c >= (int)b/d)	l -= (int)(a/c-0.5)+1;
		else	l-= (int)(b/d-0.5)+1;
		System.out.println(l);

	}

}