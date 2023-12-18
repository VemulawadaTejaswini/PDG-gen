import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && k == 0 && m == 0) break;

			LinkedList<Integer> list = new LinkedList<Integer>();
			for(int i=1;i<=n;i++){
				list.add(i);
			}

			int idx = m - 1;
			while(list.size() != 1){
				list.remove(idx);
				idx = (idx + k - 1) % list.size();
			}

			System.out.println(list.get(0));
		}
	}
}