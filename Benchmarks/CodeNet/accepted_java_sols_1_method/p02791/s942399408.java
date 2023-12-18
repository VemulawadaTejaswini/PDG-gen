import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int cnt = 0;
		for(int i = 0 ; i < N ; ++i){
			int pi = sc.nextInt();
			if(!ts.isEmpty()){
				int min = ts.first();
				if(min >= pi){
					++cnt;
				}
			}else{
				++cnt;
			}
			ts.add(pi);
		}
		System.out.println(cnt);
	}
}
