import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String number = null;
		
		Scanner sn = new Scanner(System.in);
		String n = sn.next();
		if(1000 <= Integer.parseInt(n) && Integer.parseInt(n) <= 9999){
			number = n;
		}
		sn.close();
		
		int i = 0;
		if(number.charAt(i) == number.charAt(i+1) && number.charAt(i) == number.charAt(i+2)
				|| number.charAt(i+1) == number.charAt(i+2) && number.charAt(i+1) == number.charAt(i+3)){
				System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}