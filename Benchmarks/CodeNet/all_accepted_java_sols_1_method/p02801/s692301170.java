import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u",
				"v","w","x","y","z"} ;
      
		String C = sc.next();
		String answer = "No answer";

		for(int i = 0;i <= 24;i++ ) {
			if(alphabet[i].equals(C)) {
				answer = alphabet[i+1];
			}else {
			}
		}
		System.out.println(answer);
	}
}
