import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userS="";
		do{
			userS = scan.nextLine();
		}while (userS.length() <= 0 || userS.length() >= 10);

		String userT = scan.nextLine();;

		if(canSet(userS, userT)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}

	public static boolean canSet(String userS, String userT) {
		boolean canSet = true;

		if(userS.length() + 1 != userT.length()){
			canSet = false;
		}

		for (int i = 0, len = userS.length(); i < len ; i++){
			if(userS.charAt(i) != userT.charAt(i)){
				canSet = false;
			}
		}
		return canSet;
	}
}