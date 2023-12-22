import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tairyoku = sc.nextInt();
		int syurui = sc.nextInt();
		int total = 0;
		for(int i= 0; i<syurui;  i++) {
			total  = total + sc.nextInt();
		}
		
		if(total<tairyoku) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}

	}

}