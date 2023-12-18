import java.util.*;
import java.text.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> dist = new ArrayList<Integer>();
		int t = in.nextInt();
		for(int j=0; j<t; j++){
			int n = in.nextInt();
			int k = in.nextInt();
			int a = in.nextInt();
			int b = 0;
			for(int i=0; i<n-1; i++){
				b = in.nextInt();
				dist.add(b-a);
				a = b;
			}
			Collections.sort(dist);
			int cost = 0;
			for(int i=0; i<n-k; i++){
				cost += dist.get(i);
			}
			System.out.println(cost);
			dist.clear();
		}
	}
}