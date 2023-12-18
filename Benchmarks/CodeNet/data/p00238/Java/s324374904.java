import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0238();
	}

	class AOJ0238{
		public AOJ0238() {
			while(true){
				int t = in.nextInt();
				if(t==0)break;
				int n = in.nextInt();
				int sum = 0;
				for(int i=0;i<n;i++){
					int a = in.nextInt(),b = in.nextInt();
					sum+=(b-a);
				}
				System.out.println(t<=sum? "OK":t-sum);
			}
		}
	}

}