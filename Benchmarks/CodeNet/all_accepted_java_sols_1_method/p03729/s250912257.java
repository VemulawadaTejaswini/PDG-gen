import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next(),b = scanner.next(),c = scanner.next();
		boolean check1 = false,check2 = false;
		if(a.charAt(a.length()-1) == b.charAt(0)){
			check1 = true;
		}
		if(b.charAt(b.length()-1) == c.charAt(0)){
			check2 = true;
		}

		if(check1 && check2){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
