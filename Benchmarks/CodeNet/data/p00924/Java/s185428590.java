import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	int n,m;
	List<Integer> b,p;

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner stdIn = new Scanner(System.in);
		n = stdIn.nextInt();
		m = stdIn.nextInt();
		b = new ArrayList<Integer>();
		p = new ArrayList<Integer>();
		int zero=0, ichi=0;
		for(int i=0;i<n;i++){
			b.add(stdIn.nextInt());
			if(b.get(i)==1){
				ichi++;
			}
			else{
				zero++;
			}
		}
		int ki=0, gu=0;
		for(int i=0;i<m;i++){
			p.add(stdIn.nextInt());
			if(i%2==0){
				gu+=p.get(i);
			}
			else{
				ki+=p.get(i);
			}
		}
		if(ki==gu){
			int min = Integer.MAX_VALUE;
			min = Math.min(judge(make(0)),min);
			min = Math.min(judge(make(1)),min);
			System.out.println(min);
		}
		else{
			if(ki!=zero){
				System.out.println(judge(make(0)));
			}
			else{
				System.out.println(judge(make(1)));
			}
		}
	}

	private int judge(List<Integer> target) {
//		System.out.println(target);
		int cnt = 0;
		for(int i=0;i<target.size();i++){
			if(target.get(i)!=b.get(i)){
				for(int j=target.size()-1;j>=0;j--){
					if(target.get(j)!=b.get(j)){
						cnt += (j-i);
						break;
					}
				}
			}
		}
		return cnt;
	}

	private List<Integer> make(int start) {
		List<Integer> result = new ArrayList<Integer>();
		int now = start;
		for(int i=0;i<p.size();i++){
			for(int j=0;j<p.get(i);j++){
				result.add(now);
			}
			if(now==1){
				now = 0;
			}
			else{
				now = 1;
			}
		}
		return result;
	}

}