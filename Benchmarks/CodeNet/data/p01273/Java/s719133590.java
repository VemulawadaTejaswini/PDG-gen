import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0)break;
			else calc(n , m);
			
		}
	}
	public void calc(int n, int m){
		ArrayList<int[]> list = new ArrayList<int[]>();
		for(int i = 0; i < m; i++){
			int t = sc.nextInt();
			int s = sc.nextInt();
			int d = sc.nextInt();
			list.add(new int[]{t,s,d});
		}
		list = mergeSort(list);
		
		int[] pc = new int[n+1];
		pc[1] = 1;
		int sum = 1;
		for(int i = 0; i < list.size(); i++){
			int[] item = list.get(i);
			if(pc[item[1]] == 1 && pc[item[2]] == 0){
				pc[item[2]] = 1;
				sum++;
			}
			
		}
		System.out.println(sum);
	}

	public ArrayList<int[]> mergeSort(ArrayList<int[]> list){
		if(list.size() > 1){
			int n = list.size() / 2;
			int m = list.size() - n;
			ArrayList<int[]> a1 = new ArrayList<int[]>();
			ArrayList<int[]> a2 = new ArrayList<int[]>();
			for(int i = 0; i < n; i++) a1.add(list.get(i));
			for(int i = 0; i < m; i++) a2.add(list.get(i + n));
			a1 = mergeSort(a1);
			a2 = mergeSort(a2);
			return merge(a1, a2);
		}
		else return list;
	}
	public ArrayList<int[]> merge(ArrayList<int[]> a1, ArrayList<int[]> a2){
		int i = 0;
		int j = 0;
		ArrayList<int[]> a = new ArrayList<int[]>();
		while(i < a1.size() || j < a2.size()){
			if(j >= a2.size() || (i < a1.size() && a1.get(i)[0] < a2.get(j)[0])){
				a.add(a1.get(i));
				i++;
			}
			else {
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