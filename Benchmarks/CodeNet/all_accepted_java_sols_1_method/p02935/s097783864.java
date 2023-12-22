import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		for(int i = 0; i < n; ++i){
			valueList.add(sc.nextInt());
		}
		Collections.sort(valueList);
		Collections.reverse(valueList);
		
		double ans = 0.0;
		double coefficient = 1.0;
		
		for(int i = 0; i < n; ++i){
			if(i < n - 1){
				coefficient *= 0.5;
			}
			ans += valueList.get(i) * coefficient;
		}
		System.out.println(ans);
	}
}