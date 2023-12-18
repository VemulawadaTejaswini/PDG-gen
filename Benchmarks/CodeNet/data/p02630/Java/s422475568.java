import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			a.add(sc.nextInt());
		}
		int q = sc.nextInt();
		int b;
		int c;
		int sum;
		for(int i=0;i<q;i++){
			b = sc.nextInt();
			c = sc.nextInt();
			sum = 0;
			while(a.indexOf(b)!=-1){
				a.set(a.indexOf(b),c);
			}
			for(int j : a){
				sum += j;
			}
			System.out.println(sum);
		}
    }
}