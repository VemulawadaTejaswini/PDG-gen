import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				String str = sc.nextLine();
				if(str.equals("END OF INPUT")) break;
				String []words = str.split(" ");
				for(int i=0; i<words.length; i++) {
					System.out.print(words[i].length());
				}
				System.out.println();
			}
		}
	}
}
