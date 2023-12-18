import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();	//回数
		int W = sc.nextInt();	//K番目に小さいかず
		
		int sum = W+H;
		
		if (sum >=10){
			System.out.println("error");
		}
		else {
			System.out.println(sum);
		}
		
				
	}

}
