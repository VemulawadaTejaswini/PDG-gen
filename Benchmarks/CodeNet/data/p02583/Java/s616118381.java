import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	ArrayList<Integer> llist = new ArrayList<>();
	ArrayList<Integer> num = new ArrayList<>();
	int n = sc.nextInt();
	int count = 0;
	int s = 1;
	for (int i = 0; i < n; i++) {
		int l = sc.nextInt();
		llist.add(l);
	}
	Collections.sort(llist);

	for (int i = 0; i < n-1; i++) {
		if(llist.get(i) == llist.get(i+1)) {

		}else {
			num.add(llist.get(i));
			s++;
		}
	}
	num.add(llist.get(n-1));
	for(int i = 0; i < num.size(); i++) {
		for(int j = 0; j < num.size(); j++) {
			for(int k = 0; k < num.size(); k++) {
				if((i == j || j == k || k == i) &&( !(llist.get(i) == llist.get(j)) ||!(llist.get(j) == llist.get(k)) || !(llist.get(k) == llist.get(i)))) {
					continue;
				}else {
					if(llist.get(i)+llist.get(j) > llist.get(k) && llist.get(j)+llist.get(k) > llist.get(i) && llist.get(k)+llist.get(i) > llist.get(j)) {
						count++;
					}
				}
			}
		}
	}

	System.out.println(count);


}
}
