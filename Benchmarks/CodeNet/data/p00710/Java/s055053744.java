
import java.util.*;
public class Main {
	
	private void doit(){
		Scanner sc =new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int r = sc.nextInt();
			if((n|r) == 0) break;
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = n ; i >= 1; i--){
				list.add(i);
			}
			for(int i = 0; i < r; i++){
				int p = sc.nextInt() - 1;
				int c = sc.nextInt();
				
				ArrayList<Integer> list2 = new ArrayList<Integer>();
				for(int j = p; j < p + c; j++){
					list2.add(list.get(j));
				}
				while(c-- > 0){
					//System.out.println("pass");
					list.remove(p);
				}
				for(int j = 0; j < list.size(); j++){
					list2.add(list.get(j));
				}
				list.clear();
				list.addAll(list2);
				//System.out.println(list2.toString());
			}
			System.out.println(list.get(0));
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}