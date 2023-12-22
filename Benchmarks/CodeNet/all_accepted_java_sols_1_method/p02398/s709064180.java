import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int count = 0;

		for(int i=0;i+a<=b;i++){
			if(c%(a+i) == 0){
				count++;
			}
		}

		System.out.println(count);

		scan.close();
	}
}