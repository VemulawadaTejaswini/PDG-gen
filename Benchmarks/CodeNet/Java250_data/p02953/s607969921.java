import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> numList = new ArrayList<>();
		String ans = "Yes";
		
		for(int i = 1; i <= n; i++) {
			numList.add(sc.nextInt());
		}
		
		int max = numList.get(0) - 1;
		for(int i = 1; i < numList.size(); i++) {
			if(max < numList.get(i)){
				max = numList.get(i) - 1;
			}else if(max == numList.get(i)){
				max = numList.get(i);
			}else {
				ans = "No";
				break;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}