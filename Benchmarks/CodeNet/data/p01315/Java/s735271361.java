import java.util.ArrayList;
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
		ArrayList<String[]> list = new ArrayList<String[]>();
		for(int i = 0; i < n; i++){
			String L = sc.next();
			int P = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			int E = sc.nextInt();
			int F = sc.nextInt();
			int S = sc.nextInt();
			int M = sc.nextInt();
			
			float time = (float)A + B + (C + D + E) * M;
			float money = (float)F * S * M - P;
			
			float kouritsu = money / time;
			
			list.add(new String[]{L, String.valueOf(kouritsu)});
		}
		ArrayList<String[]> a = mergeSort(list);
		for(int i = 0; i < a.size(); i++){
			System.out.println(a.get(i)[0]);
		}
		System.out.println("#");
	}

	public ArrayList<String[]> mergeSort(ArrayList<String[]> list){
		if(list.size() > 1){
			int m = list.size() / 2;
			int n = list.size() - m;
			ArrayList<String[]> a1 = new ArrayList<String[]>();
			ArrayList<String[]> a2 = new ArrayList<String[]>();
			for(int i = 0; i < m; i ++) a1.add(list.get(i));
			for(int i = 0; i < n; i++) a2.add(list.get(i + m));
			a1 = mergeSort(a1);
			a2 = mergeSort(a2);
			return merge(a1, a2);
		}
		else return list;
	}
	public ArrayList<String[]> merge(ArrayList<String[]> a1, ArrayList<String[]> a2){
		int i = 0;
		int j = 0;
		ArrayList<String[]> a = new ArrayList<String[]>();
		while(i < a1.size() || j < a2.size()){
			if(i < a1.size() && 
					(j >= a2.size() || 
					Float.valueOf(a1.get(i)[1]) > Float.valueOf(a2.get(j)[1]) || 
					(a1.get(i)[1].equals(a2.get(j)[1]) && a1.get(i)[0].compareTo(a2.get(j)[0]) < 0))){
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