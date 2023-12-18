import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		TreeSet<Integer> set=new TreeSet<>();
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			set.add(in.nextInt());
		}
		
		int m=in.nextInt();
		for(int i=0;i<m;i++) {
			set.add(in.nextInt());
		}
		
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

