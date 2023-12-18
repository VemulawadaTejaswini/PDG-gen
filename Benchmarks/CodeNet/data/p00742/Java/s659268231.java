import java.util.*;

public class Main{
	//1200 start
	int size, n, ans, rightsize;
	String [] data;
	HashMap<Character, Integer> change, leftmap;
	boolean [] used;
	ArrayList<Character> data2;
	HashSet<Character> nonzero;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0)break;
			leftmap = new HashMap<Character, Integer>();
			HashSet<Character> kind = new HashSet<Character>();
			HashSet<Character> rightkind = new HashSet<Character>();
			nonzero = new HashSet<Character>();
			data = new String[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.next();
				int nowlen = data[i].length();
				for(int j = 0; j < nowlen; j++){
					char c = data[i].charAt(j);
					if(j == 0 && nowlen > 1){
						nonzero.add(c);
					}
					int value =  pow((nowlen - 1 - j));

					if(i != n-1){
						kind.add(c);
						if(leftmap.containsKey(c)){
							leftmap.put(c, leftmap.get(c) + value);
						}
						else{
							leftmap.put(c, value);
						}
					}
					else{
						rightkind.add(c);
						if(leftmap.containsKey(c)){
							leftmap.put(c, leftmap.get(c) - value);
						}
						else{
							leftmap.put(c, -value);
						}
					}
				}
			}

			change = new HashMap<Character, Integer>();
			rightsize = rightkind.size();
			data2 = new ArrayList<Character>();
			for(char c : rightkind){
				data2.add(c);
			}
			for(char c: kind){
				if(rightkind.contains(c)) continue;
				data2.add(c);
			}
			size = data2.size();
			ans = 0;
			used = new boolean[10];
			dfs(0,0);
			System.out.println(ans);
		}
	}

	private int pow(int x) {
		int sum = 1;
		for(int i = 0; i < x; i++){
			sum *= 10;
		}
		return sum;
	}

	private void dfs(int deep, int left) {
		if(deep == size){
			if(left ==0){
				ans++;
			}
			return;
		}
		if(deep > rightsize && left > 0){
			return;
		}
		char now = data2.get(deep);

		for(int i = 0; i < 10; i++){
			if(used[i])continue;
			if(i == 0 && nonzero.contains(now)){
				continue;
			}
			used[i] = true;
			int addleft = 0;
			addleft = leftmap.get(now) * i;
			if(deep+1 == size){
				if(left + addleft == 0){
					ans++;
				}
			}
			else{
				dfs(deep+1, left + addleft);
			}
			used[i] = false;
		}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}