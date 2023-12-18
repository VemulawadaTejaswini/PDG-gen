import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int n;
	private int[] A;



	public void mainrun() {
		scan = new Scanner(System.in);

		n = scan.nextInt();
		A = new int[n];
		for(int i = 0;i < n ; i++) {
			A[i] = scan.nextInt();
		}

		shellSort();

		System.out.println(m);
		G.forEach(System.out::print);

		System.out.println(cnt);
		Arrays.stream(A).forEach(System.out::println);
	}

	private void insertionSort(int g) {
		int v,j;
		for(int i = g;i < n;i++) {
			v = A[i];
			j = i - g;
			while(j >= 0 && A[j] > v) {
				A[j + g] = A[j];
				j = j - g;
				cnt++;
			}
			A[j + g] = v;
		}
	}

	int cnt,m;
	List<String> G ;

	private void shellSort() {
		cnt = 0;
		G = new ArrayList<>();

		int add = 0;
		int num = 0;
		
		while(true){
			add += Math.pow(3, num);
			if(add > n) {
				break;
			}
			G.add(Integer.toString(add) + " ");
			m++;
			num++;
	    }

		G.sort((e1 , e2) -> Integer.parseInt(e2.trim()) - Integer.parseInt(e1.trim()));
		G.set(m - 1, G.get(m - 1).trim() + "\n");

		for(String s : G) {
			insertionSort(Integer.parseInt(s.trim()));
		}
	}

}
