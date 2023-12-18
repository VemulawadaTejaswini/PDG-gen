import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj0100().doIt();
	}
	class aoj0100{
		void doIt(){
			while(true){
				int n = sc.nextInt();
				if(n == 0)break;
				boolean over = false;
				long num[] = new long [4001];
				for(int i = 0;i < n;i++){
					int ban = sc.nextInt();
					int kati = sc.nextInt();
					int cnt = sc.nextInt();
					num[ban] = num[ban] + (kati * cnt);
				}
				for(int i = 0;i <= 4000;i++){
					if(num[i] >= 1000000){
						System.out.println(i);
						over = true;
					}
				}
				if(!over)System.out.println("NA");
			}
		}
	}
}