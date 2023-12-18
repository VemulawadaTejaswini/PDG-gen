import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int a,b;
		while(cin.hasNext()){
			a=cin.nextInt();
			b=cin.nextInt();
			System.out.printf("%d\n%d\n",GCD(a,b),LCM(a,b));
			
			
			
		}
	}
	int GCD(int a,int b){
		if(a<b){
			int temp=a;a=b;b=temp;
		}
		if(b==0) return a;
		return GCD(b,a%b);
	}
	int LCM(int a,int b){
		return a*b/GCD(a,b);
	}

}