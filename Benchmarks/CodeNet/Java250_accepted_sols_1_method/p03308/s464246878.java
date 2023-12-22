import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0;i < n;i++){
			a.add(sc.nextInt());
		}
		int min;int max;
		Collections.sort(a);
		min = a.get(0);
		max = a.get(n-1);
		System.out.println(Math.abs(max-min));
	}
}
