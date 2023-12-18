import java.util.Scanner;

class Main {
	
	static int getGCD(int a,int b){
		if(b > a){
			int temp=a;  a=b;  b=temp;
		}
		
		if(a % b==0)
			return b;
		
		return getGCD(b,a%b);
	}
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println(getGCD(a,b));
	}
}
