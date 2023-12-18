import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		int a =(int) (N / 1.08);
		
		
		if((int)(a*1.08) == N) {
			System.out.println(a);
		}else if((int)((a+1)*1.08) == N) {
			System.out.println(a+1);
		}else {
			System.out.println(":(");
		}
		
	}



}
