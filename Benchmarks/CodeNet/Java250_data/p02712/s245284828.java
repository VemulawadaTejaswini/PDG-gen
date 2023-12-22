import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long result = 0;

		for(int i=1;i<=N;i++) {
			if(i%3!=0&&i%5!=0) {
				result = result+i;
			}
		}
		System.out.println(result);
	}


}

