import java.util.Scanner;

class Main{
	public static void main(String[] args){
		
		Scanner num = new Scanner(System.in);
		
		int a = num.nextInt();
		int b = num.nextInt();
		if(a == b){
			System.out.println("a == b");
		}else if(a > b){
			System.out.println("a > b");
		}else if(a < b){
			System.out.println("a < b");
		}else{
			System.out.println("入力に問題があります");
		}
	}
}