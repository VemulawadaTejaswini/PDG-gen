import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	ArrayList<Long> llist = new ArrayList<>();
	int n = sc.nextInt();
	int count = 0;
	for (int i = 0; i < n; i++) {
		long l = sc.nextLong();
		llist.add(l);
	}
	Collections.sort(llist);

	for(int i = 0; i < n-2; i++) {
		for(int j = i+1; j < n-1; j++) {
			for(int k = j+1; k < n; k++) {
				if(llist.get(i).equals(llist.get(j)) || llist.get(j).equals(llist.get(k)) || llist.get(k).equals(llist.get(i))) {
					continue;
				}

				if(llist.get(i)+llist.get(j) > llist.get(k) && llist.get(j)+llist.get(k) > llist.get(i) && llist.get(k)+llist.get(i) > llist.get(j)) {
					count++;
				}
			}
		}
	}

System.out.println(count);

}
}
