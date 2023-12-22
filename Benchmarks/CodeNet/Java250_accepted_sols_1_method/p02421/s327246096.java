import java.util.Scanner;

class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int tarowSum = 0;

		int hanakoSum = 0;

		for(int i=0; i < n; i++) {

			// 入力を受け取る
			String ta = sc.next();
			String ha = sc.next();

			if(ta.compareTo(ha) > 0)
				tarowSum += 3;

			else if(ta.compareTo(ha) < 0)
				hanakoSum += 3;
			else {	// 引き分けの場合は、プラス1点
				tarowSum++;
				hanakoSum++;
			}
		}
		System.out.println(tarowSum + " " + hanakoSum);
		sc.close();
	}
}
