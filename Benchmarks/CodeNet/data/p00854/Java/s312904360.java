import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && k == 0 && m == 0)break;
			else calc(n, k, m);
			
		}
	}
	public void calc(int n, int k, int m){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = m+1; i < n+1; i++){
			list.add(i);
		}
		for(int i = 1; i < m; i++){
			list.add(i);
		}
		int t = k;
		while(list.size()!=1){
			if(t <= list.size()){
				list.remove(t-1);
				t = t + k - 1;
			}
			else{
				while(t > list.size()){
					t = t - list.size();
				}
				list.remove(t-1);
				t = t + k - 1;
			}
		}
		System.out.println(list.get(0));
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}