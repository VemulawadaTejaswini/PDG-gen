import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(str.charAt(0));
		System.out.print(str.length()-2);
		System.out.print(str.charAt(str.length()-1)+"\n");
	}
}