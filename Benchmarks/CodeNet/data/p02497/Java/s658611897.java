import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m;  // 中間試験
		int f;  // 期末試験
		int r;  // 再試験
		int grade;
		String[] code = {"F", "D", "C", "B", "A"};

		while (true){
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			int base = m + f;

			if (m == -1 && f == -1 && r == -1){
				break;
			}

			// 成績判定
			if (m == -1 && f == -1){
				grade = 0;
			}else if (base >= 80){
				grade = 4;
			}else if (base >= 65){
				grade = 3;
			}else if (base >= 50 || (base >= 30 && r >= 50)){
				grade = 2;
			}else if (base >= 30){
				grade = 1;
			}else{
				grade = 0;
			}

			// 出力
			System.out.println(code[grade]);
		}
	}
}