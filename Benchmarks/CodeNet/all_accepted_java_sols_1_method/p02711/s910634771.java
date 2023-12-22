import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] s = str.split("");
		boolean f = false;
		for(String a: s){
			if(a.equals("7")) f =true;
		}
		if(f){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
