import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = 0;
		
		for(int i = 0; i < b; i++){
			temp = temp + sc.nextInt();
		}
		
		if(temp >= a){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
