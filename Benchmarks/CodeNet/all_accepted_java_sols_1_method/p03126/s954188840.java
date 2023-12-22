import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<n;i++) {
		int k=sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		for(int j=0;j<k;j++) {
			if(i==0) set.add(sc.nextInt());
			else 	list.add(sc.nextInt());
		}if(i!=0)
		set.retainAll(list);
		}
		
		System.out.println(set.size());
	}

}
