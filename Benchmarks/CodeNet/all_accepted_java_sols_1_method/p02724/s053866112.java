import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int X=scan.nextInt();
		int count1=X/500;
		int nokori=X-500*count1;
		int count2=nokori/5;
		int uresisa=1000*count1+5*count2;
		System.out.println(uresisa);
	}

}