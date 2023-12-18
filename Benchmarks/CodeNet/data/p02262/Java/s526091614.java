
import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	
	int n;
	int[] A;
	int m,cnt;
	int h;
	public ArrayList<Integer> G  = new ArrayList<Integer>();
	
	public void input() {
		n = sc.nextInt();
		A = new int[n];
		for(int i=0; i<n; i++) {A[i] = sc.nextInt();}
	}
	
	public void shellSort() {
		cnt = 0;
		m = 0;
		for(h =1; h<=n; h=h*3+1) {
			m++;
			G.add(h);
		}
		for(int i=m-1; i>=0; i--) {insertSort(G.get(i));}
	}
	
	public void insertSort(int g) {
		for(int i=g; i<n; i++) {
			int v = A[i];
			int j = i -g;
			while(j>=0 && A[j] > v) {
				A[j+g]  =A[j];
				j -= g;
				cnt++;
			}
			A[j+g] = v;
		}
	}
	
	public void output() {
		System.out.println(m);
		for(int i=G.size()-1; i>=0; i--) {
			if(i == 0) System.out.println( G.get(i) );
			else System.out.print(G.get(i)+" ");
		}
		System.out.println(cnt);
		for(int i=0; i<n; i++) System.out.println(A[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.shellSort();
		obj.output();
	}
}

