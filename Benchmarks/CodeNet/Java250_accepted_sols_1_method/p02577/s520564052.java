import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N_str = sc.next();
		String[] N_list = N_str.split("");
		int check = 0;
		for (int i = 0; i < N_list.length; i++) {
			check += Integer.parseInt(N_list[i]);
		}
		if(check%9==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
