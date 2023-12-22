import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		if(s.length() >= 4 && s.substring(0, 4).contentEquals("YAKI")){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
