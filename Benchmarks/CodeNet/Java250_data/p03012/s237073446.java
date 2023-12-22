import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		List<String> l = Arrays.asList(sc.nextLine().split(" "));
		ArrayList<Integer> nl = new ArrayList<Integer>();
		ArrayList<Integer> ansl = new ArrayList<Integer>();
		int front=0;
		int back=0;
		for(String s:l) {
			nl.add(Integer.parseInt(s));
		}
		for(int i=0;i<n;i++) {
			front=0;
			back=0;
			for(int j=0;j<i;j++) {
				front+=nl.get(j);
			}
			for(int k=0;k<n-i;k++) {
				back+=nl.get(n-k-1);
			}
			ansl.add(Math.abs(front-back));
		}
		int min = ansl.get(0);
		for(int a:ansl) {
			if(a<min) {
				min=a;
			}
		}
		System.out.println(min);
	}
}