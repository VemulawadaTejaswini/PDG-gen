import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		int x =scanner.nextInt();
		int y =scanner.nextInt();
		if(x>y){
			System.out.println("a > b");
		}else if(x<y){
			System.out.println("a < b");
		}else{
			System.out.println("a == b");
		}
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}
}