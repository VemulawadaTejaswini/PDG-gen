import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int counter = 0;
		ArrayList<Integer> s = new ArrayList<Integer>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			s.add(sc.nextInt());
		}
		int q = sc.nextInt();
		int t [] = new int [n];
		for(int i = 0; i < q; i++){
			t[i] = sc.nextInt();
		}
		
		for(int i = 0; i < q; i++){
			if(s.contains(t[i])){
				counter++;
			}
		}
		System.out.println(counter);
	}
}