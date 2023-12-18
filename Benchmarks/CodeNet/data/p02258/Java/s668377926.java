import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> R = new ArrayList<Integer>();
		int n, max = -1000000000, minR;
		
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			R.add(sc.nextInt());
		}
		
		minR = R.get(0);
		for(int i = 1; i < n; i++){
			max = Math.max(max, R.get(i)-minR);
			minR = Math.min(minR, R.get(i));
		}
		
		System.out.println(max);
	}
}