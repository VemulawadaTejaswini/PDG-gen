import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int a = 0;
		for(int i = 0; i < 3 ; i++) {
			if(str1.charAt(i) == str2.charAt(2-i)) {
				a += 1;
			}else {
				a += 0;
			}
		}
		if(a == 3){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

}
