import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String msg ="";
		if(a > b){
			msg = "a > b";
		} else if(a < b){
			msg = "a < b";
		} else {
			msg = "a == b";
		}

		System.out.println(msg);
	}
}
