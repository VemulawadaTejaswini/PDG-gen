import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String ans = "No";

		for(int i = 1; i < 10; i++) {
			if(num % i == 0 && num < i *10) {
				ans = "Yes";
				break;
			}
		}

		System.out.println(ans);
	}
}


