import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		char kigou;
		Scanner kbd = new Scanner(System.in);
		int a = kbd.nextInt();
		int b = kbd.nextInt();
		if(a > b){
			System.out.println("a > b");
		}else if(a<b){
			System.out.println("a < b");;
		}else{
			System.out.println("a == b");
		}

	}
}