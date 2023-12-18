import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		calc(n,m);
	}
	public void calc(int n, int m){
		ArrayList<int[]> list = new ArrayList<int[]>();
		for(int i = 0; i < n; i++){
			int s = sc.nextInt();
			int t = sc.nextInt();
			list.add(new int[]{s,t});
		}
		ArrayList<Integer> ps = new ArrayList<Integer>();
		for(int i = 0; i < m; i++){
			int p = sc.nextInt();
			ps.add(p);
		}
		ps = sort(ps);
		long ans = 0;
		for(int i = 0; i < n; i++){
			int s = list.get(i)[0];
			int t = list.get(i)[1];
			
			if(s < t){
				int nowS = s;
				boolean b = true;
				for(int j = 0; j < m; j++){
					int p = ps.get(j);
					if(p >= t) break;
					else if(s < p && p < t){
						if(b){
							ans += p - nowS;
							b = false;
						}
						else b = true;
						nowS = p;
					}
				}
				if(b) ans += t - nowS;
			}
			else {
				int nowS = s;
				boolean b = true;
				for(int j = m-1; j >= 0; j--){
					int p = ps.get(j);
					if(p >= s) break;
					else if(t < p && p < s){
						if(b){
							ans += nowS - p;
							b = false;
						}
						else b = true;
						nowS = p;
					}
				}
				if(b) ans += nowS - t;
			}
		}
		System.out.println(ans);
	}

	public ArrayList<Integer> sort(ArrayList<Integer> list){
		if(list.size() <= 1) return list;
		int m = list.size() / 2;
		int n = list.size() - m;
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		for(int i = 0; i < m; i++) a1.add(list.get(i));
		for(int i = 0; i < n; i++) a2.add(list.get(i+m));
		a1 = sort(a1);
		a2 = sort(a2);
		return merge(a1, a2);
	}
	public ArrayList<Integer> merge(ArrayList<Integer> a1, ArrayList<Integer> a2){
		int i = 0;
		int j = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(i < a1.size() || j < a2.size()){
			if(j >= a2.size() || (i < a1.size() && a1.get(i) < a2.get(j))){
				list.add(a1.get(i));
				i++;
			}
			else{
				list.add(a2.get(j));
				j++;
			}
		}
		return list;
	}
	public static void main(String[] args) {
		new Main().run();
	}
}