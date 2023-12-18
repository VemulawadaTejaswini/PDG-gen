import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final String a = "CF";

		boolean flag = false;
		int count = 0;
		String s = sc.next();

		for(int i = 0; i < s.length(); i++){
			if(a.charAt(count) == s.charAt(i)){
				if(++count == 2){
					flag = true;
					break;
				}
			}
		}

		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
