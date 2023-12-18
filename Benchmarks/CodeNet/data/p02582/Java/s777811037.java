import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int count=0;
		char[] tenki = new char[3];
		char temp = 'R';
		
		for(int i=0; i < 3; i++) {
			tenki[i] = s.charAt(i);
		}
		
		if(tenki[0] == 'R') {
			count++;
			if(tenki[1] == 'R') {
				count++;
				if(tenki[2] == 'R') {
					count++;
				}
			}
		}else {
			if(tenki[1] == 'R') {
				count++;
				if(tenki[2] == 'R') {
					count++;
				}
			}else {
				if(tenki[2] == 'R') {
					count++;
				}
			}
		}
		
		
		
		
		
		System.out.println(count);
		
		
		
	}

}
