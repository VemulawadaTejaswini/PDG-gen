import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		if((c>a && c>b) || (c<a && c<b)) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		  }
		}