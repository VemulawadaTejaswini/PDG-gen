import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int check = 0;
		for(int i = 0; i <= 50000; i++) {
			if((int)(i * 1.08) == N) {
				
				System.out.println(i);
				break;
			}else {
				check = i;
			}
		}
		if(check == 50000)
		{
			System.out.println(":(");
		}
	}
}
