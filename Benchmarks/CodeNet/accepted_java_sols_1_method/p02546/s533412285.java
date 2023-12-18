import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char[] word = sc.next().toCharArray();
		if(word[word.length - 1] == 's') {
			for(int i = 0; i < word.length; i++) {
				System.out.print(word[i]);
			}
			System.out.println("es");
		}else{
			for (int i = 0; i < word.length; i++) {
				System.out.print(word[i]);
			}
			System.out.println("s");
		}
        
        }
}