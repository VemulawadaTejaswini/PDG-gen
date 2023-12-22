
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> s=new HashSet<>();
		for(int i=0;i<n;i++) {
			int k=scn.nextInt();
			//System.out.println(s+" "+set);
			s=new HashSet<>();
			for(int j=0;j<k;j++) {
				int x=scn.nextInt();

				if(i==0) {
					set.add(x);
					s.add(x);
				}else {
					if(set.contains(x)) {
						s.add(x);
					}
				}
			}
			if(i!=0) {
				set.removeAll(set);
				set.addAll(s);
			}
		}
		System.out.println(s.size());
	}

}
