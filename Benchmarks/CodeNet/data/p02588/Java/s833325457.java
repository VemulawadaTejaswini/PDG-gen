import java.util.*;

public class a {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = in.nextInt();
		List<Double> tab = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			tab.add(in.nextDouble());
		}
		
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(Math.ceil(tab.get(i)*tab.get(j)) == Math.floor(tab.get(i)*tab.get(j))) {
					ans++;
				}
			}
		}
		System.out.println(ans);	
	}
}