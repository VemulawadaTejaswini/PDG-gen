import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = scan.nextInt();
		
		List<Integer> hpList = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			hpList.add(scan.nextInt());
		}
		Collections.sort(hpList);
		
		long minAttackCount = 0;
		for (int i=0; i<hpList.size()-count; i++) {
			minAttackCount += hpList.get(i);
		}
		
		System.out.println(minAttackCount);
	}
	
}