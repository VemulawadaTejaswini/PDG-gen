import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scn = new Scanner(System.in);

		String N = scn.next();

        int s = 0;
//        while(num != 0){
//            s += num % 10;
//            num /= 10;
//        }

        for (int i = 0; i < N.length(); i++) {
        	s += Integer.parseInt(N.substring(i, i+1));
        }

//        System.out.println(s);
//        if (s > 8) {
    		System.out.println(s % 9 == 0 ? "Yes" : "No");
//		} else {
//			if (s == 0) {
//				System.out.println("Yes");
//			} else {
//				System.out.println("No");
//			}
//        }


	}
}
