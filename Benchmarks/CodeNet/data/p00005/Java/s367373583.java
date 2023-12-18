import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> ansA = new ArrayDeque<Integer>();
		ArrayDeque<Integer> ansB = new ArrayDeque<Integer>();

		while(sc.hasNext()){
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(n>m){
				int l = m;
				m=n;
				n=l;
			}
			int a = m;
			int b = n;			
			while(n!=0){
				int l = n;
				n = m%n;
				m = l;
			}
			ansA.push(m);
			ansB.push((a/m)*b);
		}
		int num = ansA.size();
		for(int i=0;i<num;i++){
			System.out.println(ansA.pollLast() + " " + ansB.pollLast());
		}
	}
}