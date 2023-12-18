import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(in.hasNext())new AOJ0260().doIt();
	}
	
	class AOJ0260{
		ArrayList<Integer> p,j;
		ArrayList<Integer> list;
		HashMap<String,Integer> map;
		int dfs(int index,int sum){
			if(map.containsKey(index+" "+sum+" "+list.size()))return map.get(index+" "+sum+" "+list.size());
//			System.out.println(index+" "+sum);
//			System.out.println(list);
			if(index==p.size()){
				int a = 0;
				for(int i=0;i<list.size();i++)a+=(list.get(i)*list.size());
				map.put(index+" "+sum+" "+list.size(),a);
				return a;
			}
			int result = Integer.MIN_VALUE;
			//前の繋げる場合
			list.add(list.remove(list.size()-1)+p.get(index)+j.get(index-1));
			result=Math.max(result,dfs(index+1,sum+p.get(index)+j.get(index-1)));
			list.add(list.remove(list.size()-1)-p.get(index)-j.get(index-1));
			
			//前と繋げずスタックに積む
			list.add(p.get(index));
			result=Math.max(result,dfs(index+1,sum+p.get(index)));
			list.remove(list.size()-1);
			
			map.put(index+" "+sum+" "+list.size(),result);
			return result;
		}

		void doIt(){
			int n = in.nextInt();
			if(n==0)return;
			p = new ArrayList<Integer>();
			j = new ArrayList<Integer>();
			for(int i=0;i<n;i++)p.add(in.nextInt());
			for(int i=0;i<n-1;i++)j.add(in.nextInt());
			map = new HashMap<String, Integer>();
			list = new ArrayList<Integer>();
			list.add(p.get(0));
			int result = dfs(1,p.get(0));
			System.out.println(result);
		}
	}

}