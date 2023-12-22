import java.util.*;

public class Main{
	public static void main(String args[]){
		List<String> que = new LinkedList<String>();
		
		Scanner s = new Scanner(System.in);
		
		while (true){
			String sc = s.next();
			if (sc.equals("quit")){
				break;
			}
			
			if (sc.equals("push")){
				String c = s.next();
				que.add(c);
			}
			else if (sc.equals("pop")){
				System.out.println(que.get(que.size()-1));
				que.remove(que.size()-1);
			}
		}
	}
}