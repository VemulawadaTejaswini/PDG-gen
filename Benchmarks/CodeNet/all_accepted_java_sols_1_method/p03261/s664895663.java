import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String word[] = new String[N]; 
		
		for(int i = 0; i < N; i++) {
			word[i] = sc.next();
		}
		
		boolean isRule = true;
		for(int i = 1; i < N; i++) {
			if(word[i-1].charAt(word[i-1].length()-1) == word[i].charAt(0)) {
				isRule = true;
			}else {
				isRule = false;
				System.out.println("No");
				break;
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++){
				if(word[i].equals(word[j])) {
					isRule = false;
					System.out.println("No");
					break;
				}
			}
		}
		
		if(isRule == true) {
			System.out.println("Yes");
		}
		
	}
}
