import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a=0;


		try(Scanner scanner=new Scanner(System.in)){
			a=scanner.nextInt();
		//	b=scanner.nextInt();
		}


		//Date date =new Date();

		int b=a/3600;
		int c=(a%3600)/60;
		int d=(b%3600%60)%60;
		if(a<10&&a>=0&&a<86400) {
		System.out.println(b+":"+c+":"+d);

		}else {
		System.out.println(b+":"+c+":"+d);
		}

	}

}