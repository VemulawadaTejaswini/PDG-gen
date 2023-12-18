import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Deque<Integer> s = new ArrayDeque<>();
		List<Integer> al = new ArrayList<>();
		
		for(int i = 0; i < 8; i++) {
			int tmp = sc.nextInt();
			
			if(tmp == 0) {
				al.add(s.removeFirst());
			} else {
				s.addFirst(tmp);	
			}
		}
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}