import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int x = 0;
		int min = 753;
		for(i=0;i<s.length()-2;i++) {
			x=Math.abs(753-Integer.parseInt(s.substring(i,i+3)));
			if(x<min)min=x;
		}
		System.out.println(min);
	}
}
