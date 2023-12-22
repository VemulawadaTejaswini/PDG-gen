import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int X = sc.nextInt();
		sc.close();


		int a = 0;
		int count = 1;
		while(true){
			if(a < X){
				a = a+count;
				count++;
			}
			else{
				break;
			}
		}

		System.out.println(count-1);
	}
}
