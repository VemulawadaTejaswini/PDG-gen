import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String array[] = S.split("");
		boolean ch = true;

		for(int x = 0;x < array.length - 1;x++) {
			if(array[x].equals(array[x + 1])) {
				ch = false;
				break;
			}
		}

		if(ch == true) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
	}
}
