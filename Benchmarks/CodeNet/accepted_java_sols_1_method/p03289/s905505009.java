import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] S = sc.next().toCharArray();
		int c_count = 0;

		for (int i=0; i<S.length; i++){
			if (i == 0){
				if (S[i] != 'A'){
					System.out.println("WA");
					return;
				}
			}else if (i >= 2 && S.length-2 >= i){
				if (S[i] == 'C'){
					c_count += 1;
				}
				if (c_count > 1){
					System.out.println("WA");
					return;
				}
			}else if (Character.isUpperCase(S[i])){
				System.out.println("WA");
				return;
			}
		}
		if (c_count == 1){
			System.out.println("AC");
			return;
		}else {
			System.out.println("WA");
			return;
		}

	}
}
