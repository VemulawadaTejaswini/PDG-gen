import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> R = new ArrayList<Integer>();
		int n, max = -1000000000;
		
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			R.add(sc.nextInt());
		}
		
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				max = Math.max(max, R.get(j)-R.get(i));
			}
		}
		
		System.out.println(max);
	}
}