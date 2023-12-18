import java.util.*;

class Main{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		@SuppressWarnings("unchecked")
		LinkedList<Integer>[] la = new LinkedList[n];
		for(int i = 0; i < n; i++) la[i] = new LinkedList<Integer>();
		for(int i = 0; i < q; i++){
			int op = sc.nextInt();
			if(op == 0){
				int t = sc.nextInt();
				int x = sc.nextInt();
				la[t].add(x);
			}else if(op == 1){
				int t = sc.nextInt();
				ListIterator<Integer> it = la[t].listIterator();
				for(int j = 0; j < la[t].size(); j++){
					System.out.print(it.next());
					if(j != la[t].size() - 1) System.out.print(" ");
				}
				System.out.print("\n");
			}else{
				int t = sc.nextInt();
				la[t].clear();
				la[t] = new LinkedList<Integer>();
			}
		}
	}
}

