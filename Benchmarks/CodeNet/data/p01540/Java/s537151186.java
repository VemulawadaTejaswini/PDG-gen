import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		calc(n, m);
	}
	public void calc(int n, int m){
		ArrayList<int[]> takara = new ArrayList<int[]>();
		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			takara.add(new int[]{x,y});
		}
		takara = sort(takara);
		
		for(int i = 0; i < m; i++){
			int ans = 0;
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			for(int k = 0; k < n; k++){
				int[] now = takara.get(k);
				if(now[0] < x1){
					continue;
				}
				else if(x1 <= now[0] && now[0] <= x2){
					if(y1 <= now[1] && now[1] <= y2) ans++;
				}
				else if(x2 < now[0]){
					break;
				}
			}
			System.out.println(ans);
		}
	}

	
	public ArrayList<int[]> sort(ArrayList<int[]> list){
		if(list.size() == 1){
			return list;
		}
		else{
			int m = list.size() / 2;
			int n = list.size() - m;
			ArrayList<int[]> a1 = new ArrayList<int[]>();
			ArrayList<int[]> a2 = new ArrayList<int[]>();
			for(int i = 0; i < m; i++) a1.add(list.get(i));
			for(int i = 0; i < n; i++) a2.add(list.get(m+i));
			a1 = sort(a1);
			a2 = sort(a2);
			return merge(a1, a2);
		}
	}
	public ArrayList<int[]> merge(ArrayList<int[]> a1, ArrayList<int[]> a2){
		int i = 0;
		int j = 0;
		ArrayList<int[]> list = new ArrayList<int[]>();
		while(i < a1.size() || j < a2.size()){
			if(j >= a2.size() || (i < a1.size() && a1.get(i)[0] < a2.get(j)[0])){
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