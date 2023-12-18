import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean contain7 = false;
		char[] chArr = Integer.toString(N).toCharArray();
		for(int i = 0; i < chArr.length; i ++) {
			if(chArr[i] == '7') {
				contain7 = true;
				break;
			}
		}
		if(contain7) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}