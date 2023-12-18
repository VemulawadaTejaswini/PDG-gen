import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int ans = 0;
		int minAbs = 100;
		ArrayList<String> numList = new ArrayList<>();

		for (int i=-100; i<=101; i++) {
			numList.add(String.valueOf(i));
		}
		
		for (int i=1; i<=n; i++) {
			String p = sc.next();
			if(numList.contains(p)) {
				numList.remove(p);
			}
		}

		for (int i=0; i<numList.size(); i++) {
			int abs = Math.abs(x - Integer.parseInt(numList.get(i)));
			if(abs < minAbs) {
				minAbs = abs;
				ans = Integer.parseInt(numList.get(i));
			}
		}

		System.out.println(ans);
		sc.close();
	}

}