import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(sc.hasNext()){
			new aoj0062().doIt();
		}
	}
	void sum(int a[],int length){
		if(length > 1){
			for(int i = 0;i < length - 1;i++){
				a[i] = (a[i] + a[i+1])%10;
			}
			sum(a,length-1);
		}
	}
	class aoj0062 {	
		void doIt() {
			long str = sc.nextLong();
			int [] a = new int [10];
			for(int i = 9;i >= 0;i--){
				a[i] = (int) (str %10);
				str = str / 10;
			}
			sum(a,10);
			System.out.println(a[0]);
		}
	}
}