import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List<Integer> ls=new ArrayList<>();
		int n=in.nextInt();
		
		for(int i=0;i<n;i++) ls.add(Integer.parseInt(in.next()));
		
		int q=in.nextInt(),cnt=0;
		for(int i=0;i<q;i++) {
			if(ls.contains(Integer.parseInt(in.next())))cnt++;
		}
		
		System.out.println(cnt);
	}

}

