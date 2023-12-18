import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()){
			int sum = 0;
			for(int i=0;i<5;i++){
				int tmp = stdIn.nextInt();
				if(tmp<40) tmp = 40;
				sum += tmp;
			}
			System.out.println(sum/5);
		}
	}
}