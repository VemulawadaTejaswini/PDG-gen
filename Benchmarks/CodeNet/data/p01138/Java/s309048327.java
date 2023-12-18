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
			
			kiroku.add(new int[]{Dep, Out});
		}
		mergeSort(kiroku);
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

	public LinkedList<int[]> mergeSort(LinkedList<int[]> kiroku){
		if(kiroku.size() == 1) return kiroku;
		else{
			int m = kiroku.size() / 2;
			int n = kiroku.size() - m;
			LinkedList<int[]> a1 = new LinkedList<int[]>();
			LinkedList<int[]> a2 = new LinkedList<int[]>();
			for(int i = 0; i < m; i ++) a1.add(kiroku.get(i));
			for(int i = 0; i < n; i++) a2.add(kiroku.get(i + m));
			mergeSort(a1);
			mergeSort(a2);
			return merge(a1, a2);
		}
		
	}
	public LinkedList<int[]> merge(LinkedList<int[]> a1, LinkedList<int[]> a2){
		int i = 0;
		int j = 0;
		LinkedList<int[]> a = new LinkedList<int[]>();
		while(i < a1.size() || j < a2.size()){
			if(j >= a2.size() || (i < a1.size() && a1.get(i)[0] < a2.get(i)[0])){
				a.add(a1.get(i));
				i++;
			}
			else if(i < a1.size() && j < a2.size() && a1.get(i)[0] == a2.get(i)[0] && a1.get(i)[1] < a2.get(i)[1]){
				a.add(a1.get(i));
				i++;
			}
			else{
				a.add(a2.get(j));
				j++;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}