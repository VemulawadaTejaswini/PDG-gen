import java.util.*;
import java.math.*;
import java.io.*;
 
class Main {
	static final int INF = 2 << 29;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt() * 60 + sc.nextInt());
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			list.add(sc.nextInt() * 60 + sc.nextInt());
		}
		Collections.sort(list);
		int past = list.get(0);
		int tmp = list.get(0);
		int h = tmp/60;
		tmp -= h*60;
		System.out.print(h + ":" + ((tmp < 10)?"0":"") + tmp);
		
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i) == past) continue;
			past = list.get(i);
			tmp = list.get(i);
			h = tmp/60;
			tmp -= h*60;
			System.out.print(" " + h + ":" + ((tmp < 10)?"0":"") + tmp);
		}
		System.out.println();
		

	}
}
             
        