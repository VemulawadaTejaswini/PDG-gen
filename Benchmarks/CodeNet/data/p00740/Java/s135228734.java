import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ1159().doIt();
	}

	class AOJ1159{
		int n,p;
		void solve(){
			int[] person = new int[n];
			int wan = p;
			int ban = 0;
			int result = -1;
			while(true){
				if(wan==0){
					wan = person[ban];
					person[ban] = 0;
				}else{
					wan--;person[ban]++;
				}
//				System.out.println(Arrays.toString(person));
				if(person[ban]==p){
					result = ban;
					break;
				}
				ban = (ban+1)%n;
			}
			System.out.println(result);
		}
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();p = in.nextInt();
				if(n+p==0)break;
				solve();
			}
		}
	}

}