import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int c = a.nextInt();
		int d = a.nextInt();
		int count = 0;
		for(int i = b;i <= c;i++){
			if((d % i) == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}