import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		int x =scanner.nextInt();
		int y =scanner.nextInt();
		int z =scanner.nextInt();
		int temp;
		
		if(x>y){
			temp=x;
			x=y;
			y=temp;
		}
		if(x>z){
			temp=x;
			x=z;
			z=temp;
		}
		if(y>z){
			temp=y;
			y=z;
			z=temp;
		}
		System.out.println(x + " " + y + " " + z);
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}
}