import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++){
			int a = i;
			while(a % 10 != 3 && a >= 10){
				a /= 10;}
			if(i%3==0){
				System.out.print(" "+i);}
			else if(a % 10==3){
				System.out.print(" "+i);}}
		System.out.print("\n");
	}
}
