
import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		int lastN=0;
		int a=sc.nextInt();


		for(int i=0; i<32; i++) {
			if(a%2==1) {
				lastN=i;
			}
			a/=2;
		}
		int res=1;
		for(int i=0; i<lastN; i++) {
			res*=2;
		}
		System.out.println(res);
	}
}