import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int a=0;
		int b=0;
		if(n==2) {
			a = parseInt(sc.next());
			b = parseInt(sc.next());
		}
		sc.close();
		if(n==1) {
			System.out.println("Hello World ");
		} else if(n==2) {
			System.out.println(a+b);
		}
	}
}