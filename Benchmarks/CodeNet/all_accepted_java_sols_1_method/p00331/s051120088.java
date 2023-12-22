import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int R = s.nextInt();
		
		if (H < 0){
			int a = H + R;
			if(a < 0){
				System.out.println("-1");
			}else if(a == 0){
				System.out.println("0");
			}else{
				System.out.println("1");
			}
		}else{
			System.out.println("1");
		}
		
	}
}