import java.util.*;

public class Main{
	public static String solve(List<Integer> n, List<String> ans){
		if( n.size() == 2 ){
			if( n.get(0) + n.get(1) == 10 ){
				return "(" + ans.get(0) + " + " + ans.get(1) + ")";
			} else if( n.get(0) - n.get(1) == 10 ){
				return "(" + ans.get(0) + " - " + ans.get(1) + ")";
			} else if( n.get(1) - n.get(0) == 10 ){
				return "(" + ans.get(1) + " - " + ans.get(0) + ")";
			} else if( n.get(0) * n.get(1) == 10 ){
				return "(" + ans.get(0) + " * " + ans.get(1) + ")";
			}else {
				return "0";
			}
		}
		String result = new String();
		for(int i = 0; i < n.size(); i++){
			for(int j = i+1; j < n.size(); j++){
				if( i == j ){
					continue;
				}
				List<String> temp = new ArrayList<String>();
				List<Integer> sum = new ArrayList<Integer>();
				sum.add(n.get(i)+n.get(j));
				temp.add("(" + ans.get(i) + " + " + ans.get(j) + ")");
				for(int k = 0; k < n.size(); k++){
					if( k != i && k != j ){
						sum.add(n.get(k));
						temp.add(ans.get(k));
					}
				}
				String x = solve(sum, temp);
				if( !x.equals("0") ){
					return x;
				}
				sum.set(0, n.get(i)-n.get(j));
				temp.set(0, "(" + ans.get(i) + " - " + ans.get(j) + ")");
				x = new String(solve(sum, temp));
				if( !x.equals("0") ){
					return x;
				}
				sum.set(0, n.get(j)-n.get(i));
				temp.set(0, "(" + ans.get(j) + " - " + ans.get(i) + ")");
				x = new String(solve(sum, temp));
				if( !x.equals("0") ){
					return x;
				}
				sum.set(0, n.get(i)*n.get(j));
				temp.set(0, "(" + ans.get(i) + " * " + ans.get(j) + ")");
				x = new String(solve(sum, temp));
				if( !x.equals("0") ){
					return x;
				}
			}
		}
		return "0";
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<Integer> n = new ArrayList<Integer>();
		List<String> ans = new ArrayList<String>();
		for(int i = 0; i < 4; i++){
			int a = stdIn.nextInt();
			n.add(a);
			ans.add(Integer.toString(a));
		}
		while( n.get(0) != 0 || n.get(1) != 0 || n.get(2) != 0 || n.get(3) != 0 ){
			System.out.println(solve(n, ans));
			n = new ArrayList<Integer>();
			ans = new ArrayList<String>();
			for(int i = 0; i < 4; i++){
				int a = stdIn.nextInt();
				n.add(a);
				ans.add(Integer.toString(a));
			}
		}
	}
}