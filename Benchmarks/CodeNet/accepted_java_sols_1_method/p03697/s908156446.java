import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		if (a+b >= 10){
			System.out.println("error");
	    }
	    else {
			System.out.println(a+b);
		}
	}
}