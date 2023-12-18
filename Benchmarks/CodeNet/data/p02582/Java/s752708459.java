import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	ArrayList<String> slist = new ArrayList<>();

	String s = sc.next();
	int count = 0;
	int max = 0;

	for(int i = 0; i < 3; i++) {
		slist.add(s.substring(i, i+1));
	}

	for(int i = 0; i < 3; i++) {
		if(slist.get(i).equals("R")) {
			count++;
		}else if(slist.get(i).equals("S")) {
			if(max < count) {
				max = count;
			}
		}
	}
	if(max < count) {
		System.out.println(count);
	}else {
		System.out.println(max);
	}


}
}
