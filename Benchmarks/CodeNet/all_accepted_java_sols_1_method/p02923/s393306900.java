import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int [] ni = new int[n];
		int difference = 0;
		List<Integer> heights = new ArrayList<Integer>();
		int ans = 0;
		for(int i = 0; i < n; i++) {
			ni[i] = sc.nextInt();
		}
		for(int i = 0; i < n-1; i++) {
			if(ni[i] < ni[i+1]) {
				heights.add(difference);
				difference = 0;
			}else {
				difference++;
				if(i == n-2) {
					heights.add(difference);
				}
			}
		}
		for(int i = 0; i < heights.size(); i++) {
			if(ans <= heights.get(i)) {
				ans = heights.get(i);
			}
		}
		System.out.println(ans);
	}

}
