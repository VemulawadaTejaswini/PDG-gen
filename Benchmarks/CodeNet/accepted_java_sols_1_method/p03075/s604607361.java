import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] N = new int[5];
		boolean t = true;
		
		
		for(int i = 0;i<5;i++) {
			N[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		for(int j = 0;j<4;j++) {
			if(Math.abs(N[0]-N[j+1])>k) {
				t = false;
			}
		}
		for(int j = 0;j<3;j++) {
			if(Math.abs(N[1]-N[j+2])>k) {
				t = false;
		}
		}
		for(int j = 0;j<2;j++) {
			if(Math.abs(N[2]-N[j+3])>k) {
				t = false;
		}
		}
			if(Math.abs(N[3]-N[4])>k) t = false; 
			
			if(t ==true) {
				System.out.println("Yay!");
			}else {
				System.out.println(":(");
			}
	}
}