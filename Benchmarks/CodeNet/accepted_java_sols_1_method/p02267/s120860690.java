import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		Set<Integer> s=new HashSet<>();
		
		int n=cin.nextInt();
		for(int i=0;i<n;i++) {
			s.add(Integer.parseInt(cin.next()));
		}
		
		int res=0,q=cin.nextInt();
		for(int i=0;i<q;i++) {
			int t=Integer.parseInt(cin.next());
			if(s.contains(t))res++;
		}
		
		System.out.println(res);
	}

}

