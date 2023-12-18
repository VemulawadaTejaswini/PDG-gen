import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			ArrayList<Integer> sides = new ArrayList<Integer>();
			for(int j = 0; j < 3; j++){
				sides.add(sc.nextInt());
			}
			Collections.sort(sides, new Comparator<Integer>(){
				@Override
				public int compare(Integer a, Integer b) {
					return b-a;
				}
			});
			int a = sides.get(0);
			int b = sides.get(1);
			int c = sides.get(2);
			
			if(a * a == b * b + c * c)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}