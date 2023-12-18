import java.util.Scanner;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 0;
		while(true){
			b = sc.nextInt();
			if(b==0) break;
			System.out.println("case"+a+":"+b);
			a++;
		}
	}
}
