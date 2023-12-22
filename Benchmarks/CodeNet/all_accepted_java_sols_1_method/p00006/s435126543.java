import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String x;
		x=cin.next();
		for(int i=x.length();i>0;i--){
			char s=x.charAt(i-1);
			System.out.print(s);
		}
		System.out.println("");
	}

}