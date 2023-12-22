import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char[] work = new char[str.length()];

		for(int i = 0; i < str.length(); i++){
			work[i] = str.charAt(i);
		}
		
		if(work[2] == work[3] && work[4] == work[5]){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}