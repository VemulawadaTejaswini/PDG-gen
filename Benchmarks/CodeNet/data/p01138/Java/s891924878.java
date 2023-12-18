import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			else calc(n);
		}
	}
	public void calc(int n){
		//int[] kiroku = new int[n];
		LinkedList<int[]> kiroku = new LinkedList<int[]>();
		for(int i = 0; i < n; i++){
			String d = sc.next();
			String[] ds = d.split(":");			
			int Dep = Integer.valueOf(ds[0]) * 10000 + Integer.valueOf(ds[1]) * 100 + Integer.valueOf(ds[2]);
			
			String d2 = sc.next();
			String[] ds2 = d2.split(":");	
			int Out = Integer.valueOf(ds2[0]) * 10000 + Integer.valueOf(ds2[1]) * 100 + Integer.valueOf(ds2[2]);
			
			addSort(kiroku, new int[]{Dep, Out});
		}
		
		LinkedList<Integer> ans = new LinkedList<Integer>();
		
		for(int i = 0; i < kiroku.size(); i++){
			int[] item = kiroku.get(i);
			for(int j = 0; j < ans.size() + 1; j++){
				if(j == ans.size()) {
					ans.add(item[1]);
					break;
				}
				else if(item[0] >= ans.get(j)){
					ans.remove(j);
					ans.add(item[1]);
					break;
				}
			}
		}
		System.out.println(ans.size());
	}

	public void addSort(LinkedList<int[]> kiroku, int[] item){
		for(int i = 0; i < kiroku.size(); i++){
			if(kiroku.get(i)[0] > item[0]){
				kiroku.add(i, item);
				return;
			}
			else if(kiroku.get(i)[0] == item[0] && kiroku.get(i)[1] > item[1]){
				kiroku.add(i, item);
				return;
			}
		}
		kiroku.add(item);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}