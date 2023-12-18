import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i;
		for(i = 1; i <= n; ++i){
			if(i % 3 == 0){
				if(i != 3){
					System.out.print(" ");
				}
				System.out.print(i);
				}
			else if(i % 10 == 3){
				if(i != 3){
					System.out.print(" ");
				}
				System.out.print(i);
				}
			System.out.println();
		}
	}
}