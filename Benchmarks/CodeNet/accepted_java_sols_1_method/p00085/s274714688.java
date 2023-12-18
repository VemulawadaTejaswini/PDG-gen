import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			LinkedList<Integer> list = new LinkedList<Integer>();
			for(int i=1;i<=n;i++) list.add(i);

			int idx = n;
			while(list.size() != 1){
				idx = (idx + m - 1) % list.size();
				list.remove(idx);
			}

			System.out.println(list.get(0));
		}
	}
}