import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> removeBlock = new ArrayList<>();
		List<Deque<String>> pArray = new ArrayList<>();
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			pArray.add(new ArrayDeque<String>());
		}
		
		while(true) {
			String cmnd = sc.next();
			
			if(cmnd.equals("quit")) {
				break;
			} else if(cmnd.equals("push")) {
				int p = sc.nextInt() - 1;
				String c = sc.next();
				
				pArray.get(p).addFirst(c);
			} else if(cmnd.equals("pop")) {
				int p = sc.nextInt() - 1;
				
				removeBlock.add(pArray.get(p).removeFirst());
			} else if(cmnd.equals("move")) {
				int p1 = sc.nextInt() - 1;
				int p2 = sc.nextInt() - 1;
				
				pArray.get(p2).addFirst(pArray.get(p1).removeFirst());
			}
		}
		
		for(int i = 0; i < removeBlock.size(); i++) {
			System.out.println(removeBlock.get(i));
		}
	}
}