import java.util.*;

public class Main {
	String s;
	int id;
	
	int A(){
		ArrayList<Integer> list = new ArrayList<Integer>();

		while(true){
			if(s.charAt(id)=='['){
				id++;
				list.add(A());
				id++;
			}else{
				int t = id;
				while(48<=s.codePointAt(id) && s.codePointAt(id)<=57) id++;
				int u = Integer.valueOf(s.substring(t,id));
				list.add(u/2+1);
			}
			if(id==s.length() || s.charAt(id)==']') break;
		}
		
		Collections.sort(list);
		int sum = 0;
		for(int i=0;i<=list.size()/2;i++) sum += list.get(i);
		return sum;
	}

	void solve(){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			s = sc.next();
			id = 0;
			System.out.println(A());
		}
	}
	
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}