import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		int a = Integer.parseInt(sc.next());
		int current = a;
		int next = 0;
		boolean can = true;
		int sa = 0;
		String result = "Yes";
		while(sc.hasNext()) {
			next = Integer.parseInt(sc.next());
			if(can) current--;
			sa = current - next;
			if(sa>0) {
				result = "No";
				break;
			}
			if(current<next) {
				can = true;
			}else {
				can = false;
			}
			current = next;
		}
		System.out.println(result);
	}
}