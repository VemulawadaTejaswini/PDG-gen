import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			// キーボード入力
			int n = stdIn.nextInt();
			int count = 0;

			ArrayList<Integer> a = new ArrayList<Integer>();
			if(n >= 2){
				count++;
				a.add(2);
			}
			//√n までの素数を求める
			int root = (int)Math.sqrt(n);
			for(int i=1;i<=root;i++){
				int cnt = 0;
				for(int j=2;j<i;j++){
					if(i % j != 0){
						cnt++;
					}
					if(cnt >= i-2){
						count++;
						a.add(i);
					}
				}
			}
			for(int i=root+1;i<n;i++){
				boolean sosubaisuflg = false;
				for(int j=0;j<a.size();j++){
					if(i % a.get(j) == 0){
						sosubaisuflg = true;
						break;
					}
				}
				if(!sosubaisuflg){
					count++;
				}
			}
			System.out.println(count);
			count = 0;
			a.clear();
		}
	}
}