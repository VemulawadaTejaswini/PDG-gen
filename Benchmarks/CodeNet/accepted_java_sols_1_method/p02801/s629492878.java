import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		char[] mo = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int i;
		char a = stdIn.next().charAt(0);
		for(i=0 ; i<26 ; i++) {
			if(a == (mo[i])) {
				break;
			}
		}
		System.out.println(mo[i+1]);
	}
}
