import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		if(num%10==3)
			System.out.println("bon");
		else if(num%10==0||num%10==1||num%10==6||num%10==8)
			System.out.println("pon");
		else
			System.out.println("hon");
	}

}