import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().split("");
		int ans_flag = 0;
		String l = "L";
		String r = "R";

		for(int i=0; i<s.length;i++) {
			if((i+1)%2==1) {
				if(s[i].equals(l)) {
					ans_flag = 1;
				}
			}else {
				if(s[i].equals(r)) {
					ans_flag = 1;
				}
			}

		}


		if(ans_flag==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}

