import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int N = in.nextInt();
			if(N == 0)break;
			int count = 0;
			for(int i = 0;i < N/4;i++){
				int c = in.nextInt();
				count = count + c;
			}
			System.out.println(count);
		}
	}
}