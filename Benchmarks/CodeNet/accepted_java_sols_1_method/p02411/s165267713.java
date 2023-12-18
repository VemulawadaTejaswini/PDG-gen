import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		while(0 < 1){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a == -1 && b == -1 && c == -1) break;
			int sum = a + b;
			if(a == -1 || b == -1) System.out.printf("F\n");
			else if(a + b >= 80)  System.out.printf("A\n");
			else if(a + b >= 65)  System.out.printf("B\n");
			else if(a + b >= 50 || c >= 50)  System.out.printf("C\n");
			else if(a + b >= 30)  System.out.printf("D\n");
			else System.out.printf("F\n");
			}
		sc.close();
	}	
} 
