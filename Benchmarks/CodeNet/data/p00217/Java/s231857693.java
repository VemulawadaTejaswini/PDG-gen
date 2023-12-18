import java.util.Scanner;
 
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj217().doIt();
	}
	class aoj217{
		void doIt() {
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				int ansn = 0;
				int ansd = -1;
				for(int i = 0;i < n;i++){
					int num = sc.nextInt();
					int d1 = sc.nextInt();
					int d2 = sc.nextInt();
					if(ansd < d1 + d2){
						ansn = num;
						ansd = d1 + d2;
					}
				}
				System.out.println(ansn+" "+ansd);
			}
		}
	}
}