import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List<Integer> A=new ArrayList<>();
		int q=in.nextInt();
		for(int i=0;i<q;i++) {
			int query=Integer.parseInt(in.next());
			
			switch(query) {
			case 0:
				int x=Integer.parseInt(in.next());
				A.add(x);
				break;
				
			case 1:
				int p=Integer.parseInt(in.next());
				System.out.println(A.get(p));
				break;
				
			case 2:
				A.remove(A.size()-1);
				break;
			}
		}
	}

}
