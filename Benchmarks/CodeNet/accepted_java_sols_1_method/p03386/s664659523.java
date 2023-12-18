import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int count = sc.nextInt();
		sc.close();
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0;i<count;i++) {
			if(min+i>max && max-i<min) {
				break;
			}
			if(!numList.contains(min+i) && min+i<=max) {
				numList.add(min+i);
			}
			if(!numList.contains(max-i) && max-i>=min) {
				numList.add(max-i);
			}
		}
		Collections.sort(numList);
		for(Integer i : numList) {System.out.println(i); }
	}
}