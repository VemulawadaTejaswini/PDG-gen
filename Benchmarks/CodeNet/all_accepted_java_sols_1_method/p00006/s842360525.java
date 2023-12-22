import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		StringBuffer ans = new StringBuffer(str);
		System.out.println(ans.reverse());
		
	}
}