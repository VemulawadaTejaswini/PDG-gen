import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(sc.hasNext()){
			new Main();
		}
	}
	public Main() {
		new aoj0175().doIt();
	}
	class aoj0175{
		void doIt() {
			while(true){
				int n = sc.nextInt();
				if(n==-1)break;
	            System.out.println(Integer.toString(n,4));
			}
		}
	}
}