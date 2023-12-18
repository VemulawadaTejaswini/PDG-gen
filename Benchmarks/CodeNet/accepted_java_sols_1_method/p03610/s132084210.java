import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		
		for(int i = 0; i < x.length(); i++){
			if(i%2 == 0){
				System.out.print(x.charAt(i));
			}
		}
	}
}
