import java.util.Scanner;
public class main {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		int b= a%3600;
        int c=(a-a%3600)%60;
        int d= a-b*3600-c*60;

		System.out.println(b+":"+c+":"+d);
	}
}

