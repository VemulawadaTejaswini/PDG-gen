import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		str = str.replaceAll("0", "");
		System.out.println(str.length());
	}
}