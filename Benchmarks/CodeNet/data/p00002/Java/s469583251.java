import java.util.Scanner;

public classMain{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);


		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0) break;
		int sum = a+b;
		int valLen = String.valueOf(sum).length();
		System.out.println(valLen);
		}

	}

}
