import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<>();
		List<Integer> avg = new ArrayList<>();
		
		int n, sum, cnt;
		while(true) {
			sum = 0;
			cnt = 0;
			n = sc.nextInt();
			
			if(n == 0)	break;
			
			for(int i = 0; i < n; i++) {
				al.add(sc.nextInt());
			}
			
			Collections.sort(al);

			for(int i = 1; i < n - 1; i++) {
				sum += al.get(i);
				cnt++;
			}
			
			avg.add(sum / cnt);
			al.clear();
		}
		
		for(int i: avg) {
			System.out.println(i);
		}
	}
}