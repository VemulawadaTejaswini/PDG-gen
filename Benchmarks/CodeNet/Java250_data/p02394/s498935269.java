import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		int W =scanner.nextInt();
		int H =scanner.nextInt();
		int x =scanner.nextInt();
		int y =scanner.nextInt();
		int r =scanner.nextInt();
		
		if(r<=x && x<=W-r){
			if(r<=y && y<=H-r){
				System.out.println("Yes");
			}else System.out.println("No");
		}else System.out.println("No");
	}
	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}
}