import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();
		ArrayList<Long> al=new ArrayList<>();
		al.add(a*c);
		al.add(a*d);
		al.add(b*c);
		al.add(b*d);
		Collections.sort(al);
		System.out.println(al.get(al.size()-1));
	}

}
