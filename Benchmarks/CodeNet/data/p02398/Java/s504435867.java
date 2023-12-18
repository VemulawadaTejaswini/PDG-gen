import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 int c = scanner.nextInt();

		 int count = 0;

		 while(a!=b){
			 if(0 == (c % a)){
				 count++;
				 a++;
			 }else{
				 a++;
			 }
		 }

		 System.out.println(count);
	}
}