import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int n = stdIn.nextInt();
			int sum = 0;
			int tmp = a%b;
			for(int i=0;i<n;i++){
				sum+=tmp*10/b;
				tmp=tmp*10%b;
			}
			System.out.println(sum);
		}
	}
}