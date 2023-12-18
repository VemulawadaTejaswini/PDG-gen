import java.util.*;
public class Main {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
	if(a < b && b < c)
		System.out.println(a + " " + b + " " + c );
	else if(a < b && c < b)
		if(a < c)
			System.out.println(a + " " + c + " " + b );
		else
			System.out.println(c + " " + a + " " + b );
	else if(b < a && a < c)
		System.out.println(b + " " + a + " " + c );
	else if(b < c && c < a)
		System.out.println(b + " " + c + " " + a );
	else if(c < b && b < a)
		System.out.println(c + " " + b + " " + a );
	else if(a == b && a < c)
		System.out.println(a + " " + b + " " + c );
	else if(a ==b && c < a)
		System.out.println(c + " " + b + " " + a );
	else if(a == c && a < b)
		System.out.println(a + " " + c + " " + b );
	else if(a == c && b < a)
		System.out.println(b + " " + c + " " + a );
	else if(b == c && b < a)
		System.out.println(c + " " + b + " " + a );
	else if(b == c && a < b)
		System.out.println(a + " " + b + " " + c );
	}
}
}

