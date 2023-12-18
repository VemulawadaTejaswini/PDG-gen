import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans;
		while(true){
		int x = sc.nextInt();
		String op=sc.next();
		int y = sc.nextInt();
		if ( op.equals ("+")){
			ans=x+y;
			} else if ( op.equals ("-")){
			ans=x-y;
			} else if ( op.equals ("*")){
			ans=x*y;
			} else if ( op.equals ("/")){
			ans=x/y;
			} else {
			break;
			}
		System.out.println(ans);
		}
	}
}