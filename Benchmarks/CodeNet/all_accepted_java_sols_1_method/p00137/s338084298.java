import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 1;i <= num;i++){
			int n = in.nextInt();
			System.out.println("Case "+i+":");
			for(int j = 0;j < 10;j++){
				n = ((n * n)%1000000)/100;
				System.out.println(n);
			}	
		}
	}
}