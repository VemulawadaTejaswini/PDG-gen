
import java.util.*;
public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			String [] s = new String[n];
			for(int i = 0 ; i < n; i++){
				s[i] = sc.next();
			}
			ArrayList<ArrayList<Integer>> pass = new ArrayList<ArrayList<Integer>>();
			for(int i = 'a'; i <= 'z'; i++){
				pass.add(new ArrayList<Integer>());
			}
			for(int i = 0 ; i < n; i++){
				int a = s[i].charAt(0) - 'a';
				int b = s[i].charAt(s[i].length()-1) - 'a';
				pass.get(a).add(b);
				pass.get(b).add(a);
			}
			boolean res = isEuler(pass);
			System.out.println(res ? "OK" : "NG");
		}
	}
	
	private boolean isEuler(ArrayList<ArrayList<Integer>> pass) {
		for(int i = 0; i < pass.size(); i++){
			if(pass.get(i).size() % 2 != 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}