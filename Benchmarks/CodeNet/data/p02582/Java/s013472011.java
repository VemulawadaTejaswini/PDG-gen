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
			if(tenki[i] == 'R') {
				count++;
				if(temp == 'R') {
					
				}else {
					count--;
				}
				temp = tenki[i];
		
			}else {
				temp = tenki[i];
			}
		}
	
		System.out.println(count);
		
	}

}
