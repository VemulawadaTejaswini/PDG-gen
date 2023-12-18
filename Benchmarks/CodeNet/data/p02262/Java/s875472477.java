import java.util.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	static ArrayList<Integer> G = new ArrayList<Integer>();
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(sc.next());
		sc.close();
		long cnt = shellSort(a);
		System.out.println(G.size());
		revPrintArrayList(G);
		System.out.println(cnt);
		for(int i = 0; i < n; ++i)
			System.out.println(a[i]);
	}

	public static void printArray(int[] a){
		int n = a.length;
		for(int i = 0; i < n; ++i){
			if(i != 0) System.out.print(" ");
			System.out.print(a[i]);
		}

	}

	public static void revPrintArrayList(ArrayList<Integer> a){
		int n = a.size();
		for(int i = n-1; i >= 0; --i){
			System.out.print(a.get(i).intValue());
			if(i != 0)  System.out.print(" ");
		}
		System.out.println();
	}

	public static int insertionSort(int[] a, int g){
		int n = a.length, ret = 0;
		for(int i = g; i < n; ++i){
			int instnum = a[i], j;
			for(j = i - g; j >= 0 && a[j] > instnum; j -= g){
				a[j+g] = a[j]; ++ret;
			}
			a[j+g] = instnum;
		}
		return ret;
	}
	
	public static long shellSort(int[] a){
		long cnt = 0;
		int n = a.length;
		for(int h = 1;;){
			if(h > n) break;
			G.add(h);
			h = 3 * h + 1;
		}
		
		for(int i = G.size()-1; i >= 0; --i){
			cnt += insertionSort(a, G.get(i));
		}
		return cnt;
	}
}
