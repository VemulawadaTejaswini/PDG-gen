import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String N =in.next();
		if((N.charAt(1)==N.charAt(2))&&(N.charAt(1)==N.charAt(0)||N.charAt(1)==N.charAt(3)))System.out.println("Yes");
		else System.out.println("No");
	}
}