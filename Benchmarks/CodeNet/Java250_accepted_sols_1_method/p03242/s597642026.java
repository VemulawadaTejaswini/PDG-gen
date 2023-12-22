import java.util.Scanner;

//ABC111-A

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		char[] tmp = new char[line1.length()];

		for(int i = 0; i < line1.length(); i++){
			char ch = line1.charAt(i);

			if(ch == '1'){
				tmp[i] = '9';
			}else if(ch == '9'){
				tmp[i] = '1';
			}else{
				//ignore
			}
		}

			System.out.println(tmp);
	}
}