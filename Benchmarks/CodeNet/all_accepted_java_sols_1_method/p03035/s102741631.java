import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main{
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a <= 5)	out.println(0);
		else if(a >= 13)	out.println(b);
		else	out.println(b / 2);
	}
}
