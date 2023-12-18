import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(a<b)
			System.out.println("a < b");
		else if(a>b)
			System.out.println("a > b");
		else if(a==b)
			System.out.println("a == b");
	}

}