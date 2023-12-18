
import java.util.Scanner;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {

		for(int i=1;;i++){
			int val=sc.nextInt();
			if(val==0){
				break;
			}
			ln("Case "+i +": "+val);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}