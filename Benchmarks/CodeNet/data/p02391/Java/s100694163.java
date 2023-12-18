import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		
		int a, b;
		a = sin.nextInt();
		b = sin.nextInt();
		
		if(a == b ){
			System.out.println("a == b");
		
		}else if(a > b){
			System.out.println("a > b");
		
		}else{
			System.out.println("a < b");
		}
		
	}
}

