import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder str = new StringBuilder();
		int pointer = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '0':
				str.append('0');
				pointer++;
				break;
			case '1':
				str.append('1');
				pointer++;
				break;
			case 'B':
				if(pointer == 0){
					break;
				}
				str.deleteCharAt(pointer -1);
				pointer--;
				break;
			default:
				break;
			}
		}
		System.out.println(str.toString());
		sc.close();
	}
}
