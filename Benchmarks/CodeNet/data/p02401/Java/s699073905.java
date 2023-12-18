import java.util.Scanner;

class Main {

	public void plus(int x, int y){

		int ans = x + y;
		System.out.println(ans);
	}
	public void minus(int x, int y){

		int ans = x - y;
		System.out.println(ans);
	}
	public void times(int x, int y){

		int ans = x * y;
		System.out.println(ans);
	}
	public void divide(int x, int y){

		int ans = x / y;
		System.out.println(ans);
	}
	public void end(){
		System.exit(0);
	}
	public static void main(String[] args) {

		Main n = new Main();

		String[] str = new String[3];

		for(;;){

			Scanner scan = new Scanner(System.in);
			str[0] = scan.next();
			str[1] = scan.next();
			str[2] = scan.next();

			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[2]);

			switch(str[1]){
			case "+":
				n.plus(x, y);
				break;
			case "-":
				n.minus(x, y);
				break;
			case "*":
				n.times(x, y);
				break;
			case "/":
				n.divide(x, y);
				break;
			default:
				scan.close();
				n.end();
				break;
			}
		}
	}
}