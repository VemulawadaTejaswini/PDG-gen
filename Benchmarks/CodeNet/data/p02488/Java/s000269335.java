import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		String youngWord = sc.next();
		for (i = 0; i < n - 1; i++){
			String word = sc.next();
			if(word.compareTo(youngWord) < 0)
				youngWord = word;		
		}
		System.out.println(youngWord);
	}
}