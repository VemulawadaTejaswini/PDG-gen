
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		do{
			long pr = 0;
			long n = stdIn.nextLong();
			for(int j=2; j<=n; j++){
				long i=2;
				for(; i<n; i++)
					if(j%i==0) break;
				if(i==j) pr++;
			}
			System.out.println(pr);
		} while(stdIn.hasNext());
	}
}