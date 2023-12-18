import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<>();
		
		int d;
		while(sc.hasNext()) {
			d = sc.nextInt();
			int ans = 0;
			
			for(int i = d; i < 600; i += d) {
				ans += i * i * d;
			}
			
			al.add(ans);
		}
		
		for(int i : al) {
			System.out.println(i);
		}
	}
}