import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	ArrayList<String> slist = new ArrayList<>();

	String s = sc.next();
	boolean three = false;
	int count = 0;
	int max = 0;

	if(s.equals("RRR")) {
		max = 3;
	}else {
		for(int i = 0; i < 3; i++) {
			slist.add(s.substring(i, i+1));
		}

		for(int i = 0; i < 3; i++) {
			if(slist.get(i).equals("R")) {
				three = true;
			}else {
				three = false;
				break;
			}
		}

		for(int i = 0; i < 3; i++) {
			if(slist.get(i).equals("R")) {
				count++;
			}else if(slist.get(i).equals("S")) {
				if(max < count) {
					max = count;
					count = 0;
				}
			}
		}
	}
	if(three == true) {
		System.out.println("3");
	}else if(count > max) {
		System.out.println(count);
	}else {
		System.out.println(max);
	}

}
}
