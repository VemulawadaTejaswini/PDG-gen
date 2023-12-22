import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		String s;
		if(n%500 <= a)s = "Yes";
		else s = "No";
		System.out.println(s);
	}
}
