import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt(),b=cin.nextInt(),c=cin.nextInt();
		
		if(a<b && b<c)System.out.println("Yes");
		else System.out.println("No");
	}

}

