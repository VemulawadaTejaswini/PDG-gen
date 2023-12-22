import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		
		int cont = 0;
		for(int i = 0 ; i < s.length / 2; i++) {
			if(!s[i].equals(s[s.length - i -1])) {
				cont++;
			}
		}
		
		
		System.out.println(cont);
		
	}



}
