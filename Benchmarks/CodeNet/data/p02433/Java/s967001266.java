import java.util.*;

class Main{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		int q = Integer.parseInt(sc.next());
		LinkedList<Integer> la = new LinkedList<Integer>();
		ListIterator<Integer> it = la.listIterator();
		for(int i = 0; i < q; i++){
			int op = Integer.parseInt(sc.next());
			if(op == 0){
				int x = Integer.parseInt(sc.next());
				it.add(x);
				it.previous();
			}else if(op == 1){
				int d = Integer.parseInt(sc.next());
				if(d < 0){
					for(int j = 0; j < -d; j++) it.previous();
				}else{
					for(int j = 0; j < d; j++) it.next();
				}
			}else{
				it.next();
				it.remove();
			}
		}
		while(!la.isEmpty()){
			System.out.println(la.get(0));
			la.remove(0);
		}
	}
}

