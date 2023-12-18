import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = n - 1 ; i >= 0 ; i--) {
			list.add(a[i]);
		}
		while(list.size() > 1) {
			int now = list.get(list.size() - 1);
			for(int i = list.size() - 1 ; i >= 0 ;  i--) {
				if(now % list.get(i)  == 0) {
					now = list.get(i);
					list.remove(list.indexOf(now));
				}
			}
			num++;


		}
      System.out.println(num - 1);



	}


}

