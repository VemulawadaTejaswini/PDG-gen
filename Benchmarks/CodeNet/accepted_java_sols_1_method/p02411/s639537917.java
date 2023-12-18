import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> pit = new LinkedList<>();
		LinkedList<String> pfm = new LinkedList<>();

		int m = 0;
		int f = 0;
		int r = 0;
		
		//???????????\???
		int cnt = 0;
		while(m != -1 || f != -1 || r != -1) {
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			if(m == -1 && f == -1 && r == -1) {
				break;
			} else {
				pit.add(m);
				pit.add(f);
				pit.add(r);
				cnt+=3;
			}
		}
		
		int k = 0;
		for(int i = 2; i < cnt; i+=3) {
			if(pit.get(i-2) == -1 || pit.get(i-1) == -1) {
				pfm.add("F");
				k++;
			} else if(pit.get(i-2) + pit.get(i-1) >= 80) {
				pfm.add("A");
				k++;
			} else if(pit.get(i-2) + pit.get(i-1) >= 65) {
				pfm.add("B");
				k++;
			} else if(pit.get(i-2) + pit.get(i-1) >= 50) {
				pfm.add("C");
				k++;
			} else if(pit.get(i-2) + pit.get(i-1) >= 30) {
				if(pit.get(i) >= 50) {
					pfm.add("C");
					k++;
				} else {
					pfm.add("D");
					k++;
				}
			} else if(pit.get(i-2) + pit.get(i-1) < 30) {
				pfm.add("F");
				k++;
			}
		}
		
		for(int i = 0; i < k; i++) {
			System.out.println(pfm.get(i));
		}
	}
}