import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
  public static int cnt = 0;
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	int n = sc.nextInt();
  	int[] a = new int[n];
  	for(int i = 0; i < n; ++i) {
  		a[i] = sc.nextInt();
  	}
  	
  	//insertionSort(a, 1);
  	shellSort(a);
  	System.out.println(cnt);
  	for(int i = 0; i < n; ++i) {
  		System.out.println(a[i]);
  	}
  }
  
  public static void insertionSort(int[] a, int g){
  	for(int i = g; i < a.length; ++i) {
  		int v = a[i];
  		int j = i - g;
  		while(j >= 0 && a[j] > v) {
  			a[j + g] = a[j];
  			j = j - g;
  			cnt += 1;
  		}
  		a[j + g] = v;
  	}
  }
  
  public static void shellSort(int[] a) {
  	List<Integer> g = new ArrayList<Integer>();
  	int t = 1;
  	while(t < a.length){
  		g.add(t);
  		t = 3*t + 1;
  	}
  	int m = g.size();
  	System.out.println(m);
	
	for(int i = 0; i < g.size(); ++i) {
		System.out.print(i == 0 ? "" : " ");
		System.out.print(g.get(g.size() - 1 - i));
	}
  	System.out.println();
  	
  	for(int i = 0; i < m; ++i) {
  		insertionSort(a, g.get(i));
  	}
  }
}