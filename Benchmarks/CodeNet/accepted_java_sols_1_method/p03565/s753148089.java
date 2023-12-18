import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.next().toCharArray();
		char[] t = scanner.next().toCharArray();



		for(int i = s.length-t.length; i >= 0; i--){
			boolean flag = false;
			char[] temp = new char[s.length];
			System.arraycopy(s, 0, temp, 0, s.length);

			for(int j = 0; j < t.length; j++){
				if(temp[i+j] == t[j] || temp[i+j] == '?'){
					flag = true;
					temp[i+j] = t[j];
				}else {
					flag = false;
					break;
				}
			}

			if(flag){
				for(int j = 0; j < s.length; j++){
					if(temp[j] == '?'){
						temp[j] = 'a';
					}
					System.out.print(temp[j]);
				}
				System.out.println();
				return;
			}
		}
		System.out.println("UNRESTORABLE");
	}
}

