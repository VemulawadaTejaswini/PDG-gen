import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String y = "Yes";
		String n = "No";
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.nextLine();
		String line = sc.nextLine();
		int cnt = 1;
		int fCnt = 1;
		for(int i=0;i<line.length();i++) {
			char c = line.charAt(i);
			switch(c) {
			case 'a':
				if((A+B) >= cnt) {
					System.out.println(y);
					cnt++;
				} else {
					System.out.println(n);
				}
				break;
			case 'b':
				if(((A+B) >= cnt) && B >= fCnt) {
					System.out.println(y);
					cnt++;
					fCnt++;
				} else {
					System.out.println(n);
				}
				break;
			case 'c':
				System.out.println(n);
				break;
			}
		}
		sc.close();
	}
}