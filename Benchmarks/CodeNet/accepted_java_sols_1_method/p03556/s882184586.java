



import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int ans=sc.nextInt();

		for(int i=1; i<=32000; i++) {
			if(i*i>ans) {
				System.out.println((i-1)*(i-1));
				break;
			}
		}
	}
}