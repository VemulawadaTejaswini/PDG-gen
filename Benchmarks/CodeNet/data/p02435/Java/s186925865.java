import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int q = sc.nextInt();
			ArrayList<Stack<Integer>> S = new ArrayList<Stack<Integer>>();
			for(int i=0;i<n;i++) {
				S.add(new Stack<Integer>());
			}

			for(int i=0;i<q;i++) {
				int query = sc.nextInt();
				int t = sc.nextInt();
				switch(query) {
				case 0:
					S.get(t).push(sc.nextInt());
					break;
				case 1:
					if(S.get(t).size()>0)
						System.out.println(S.get(t).peek());
					break;
				case 2:
					if(S.get(t).size()>0)
						S.get(t).pop();
					break;
				}
			}
		}
	}
}
