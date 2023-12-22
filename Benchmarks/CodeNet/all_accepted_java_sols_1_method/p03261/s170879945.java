import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean ans = true;
		String w=sc.next();
		array.add(w);
		for(int i=0; i<a-1; i++) {
			String w2=sc.next();		
			if(array.contains(w2)) {
				ans = false;
			}
			if(w.charAt(w.length()-1)!= w2.charAt(0)) {
				ans = false;
			}
			array.add(w2);
			w=w2;
		}
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}