import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String T = sc.next();
		T = T.replaceAll("\\?","D");
		System.out.print(T);
	}
}