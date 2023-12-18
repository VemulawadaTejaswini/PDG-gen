import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s[] = str.split("");

		boolean isEasy = true;
		for (int i = 0 ; i < s.length ; i++) 
			if(i % 2 == 0){
				if(s[i].equals("L")) {
					isEasy = false;
					break;
				}
			}else{
				if(s[i].equals("R")) {
					isEasy = false;
					break;
				}

			}
		
		if (isEasy) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}	
}