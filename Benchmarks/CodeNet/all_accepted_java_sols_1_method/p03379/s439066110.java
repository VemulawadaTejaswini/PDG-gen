import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> numberList = new ArrayList<>();
		for(int i=0;i<n;i++) {
			numberList.add(Integer.parseInt(sc.next()));
		}
		sc.close();
		List<Integer> sortList =  new ArrayList<>(numberList);
		Collections.sort(sortList);
		int onesmall=sortList.get(n/2 - 1);
		int center=sortList.get(n/2);
		for(int i=0;i<n;i++) {
			if(numberList.get(i)<=onesmall) {
				System.out.println(center);
			} else {
				System.out.println(onesmall);
			}
		}
	}
}