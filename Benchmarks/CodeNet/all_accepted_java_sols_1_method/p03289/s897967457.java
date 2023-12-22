import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int validCapLetterCount= 0;

		if (S.charAt(0) != 'A' || Character.isUpperCase(S.charAt(1))
				|| Character.isUpperCase(S.charAt(S.length() - 1))) {
			System.out.println("WA");
			return;
		}

		for (int i = 2; i <= S.length()-2; i++) {
			if(Character.isUpperCase(S.charAt(i)) && S.charAt(i)=='C' && validCapLetterCount==0){
               validCapLetterCount++;
			}else if(Character.isUpperCase(S.charAt(i))){
				System.out.println("WA");
				return;
			}
		}
		
		if(validCapLetterCount==1){
			System.out.println("AC");
		}else{
			System.out.println("WA");
		}
	}
}