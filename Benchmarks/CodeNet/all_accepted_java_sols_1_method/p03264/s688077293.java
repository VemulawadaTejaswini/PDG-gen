import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		sc.close();
		if(k%2>0) System.out.print(k/2*((k+1)/2));
		else System.out.print(k/2*(k/2));
	}
}