import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		long N=sc.nextLong();
		long A=sc.nextLong();
		long B=sc.nextLong();

		if(A>B) {
			System.out.println(0);
		}
		else if(N==1 && A!=B){
			System.out.println(0);
		}
		else if(N==1 && A==B) {
			System.out.println(1);
		}
		else {
			System.out.println(B*(N-2)-A*(N-2)+1);
		}
	}
}