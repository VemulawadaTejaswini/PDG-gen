import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int res=S.chars().boxed().reduce(new ArrayList<Integer>(),
				(arr, val)->{
					if(arr.size() > 0 && arr.get(arr.size()-1)==val){
						return arr;
					}else{
						arr.add(val);
						return arr;
					}
		},
		(a,b)->{
			a.addAll(b);
			return a;
		}).size();
		System.out.println(res);
	}
}
