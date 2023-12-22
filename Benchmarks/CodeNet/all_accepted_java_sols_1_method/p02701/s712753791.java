import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] list = new String[N];
		for(int i=0;i<N;i++) {
			list[i]=scan.next();
		}
		scan.close();
		
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		
		for(int i = 0; i<list.length;i++) {
			linkedHashSet.add(list[i]);
		}
		Object[] num = linkedHashSet.toArray();
		
		System.out.println(num.length);
		
	}
}