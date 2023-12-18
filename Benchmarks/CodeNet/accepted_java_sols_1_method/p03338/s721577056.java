import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		String b=sc.next();
		int max =0;
		for(int i=1;i<a;i++) {
		Set<String> hasha = new HashSet<String>();
		Set<String> hashb = new HashSet<String>();
		String c=b.substring(0, i);
		for(int j=0;j<c.length();j++) {
		hasha.add(c.substring(j, j+1));
		}
		String d=b.substring(i);
		for(int j=0;j<d.length();j++) {
			hashb.add(d.substring(j, j+1));
			}
		hasha.retainAll(hashb);

		if(max<hasha.size()) {
			max=hasha.size();
		}
	}
System.out.println(max);

}

}