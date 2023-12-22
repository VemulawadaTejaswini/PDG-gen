import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		System.out.println(s.subSequence(0, 4)+" "+s.subSequence(4, 12));
		//char a='A';
		//System.out.println(Integer.valueOf(a));
	}
}

