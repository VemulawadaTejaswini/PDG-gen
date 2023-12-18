import java.util.Scanner;

class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int max = 0;
		int total = 0;
		for(int i=0;i<a;i++)
		{
			int input = sc.nextInt();
			if(input > max)
				max = input;
			total += input;
		}
		total = total - max + max/2;
		System.out.print(total);
		
	}
}
