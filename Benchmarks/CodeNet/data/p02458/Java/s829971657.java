import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		SortedMap<Integer, Integer> S = new TreeMap<Integer, Integer>();
		int q = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < q; i++){
			int com = sc.nextInt();
			if(com == 0){
				int x = sc.nextInt();
				if(S.containsKey(x)){
					int num = S.get(x);
					S.put(x, num + 1);
				}else{
					S.put(x, 1);
				}
				cnt++;
				System.out.println(cnt);
			}else if(com == 1){
				int x = sc.nextInt();
				if(S.containsKey(x)) System.out.println(S.get(x));
				else System.out.println(0);
			}else if(com == 2){
				int x = sc.nextInt();
				if(!S.containsKey(x)) continue;
				cnt -= S.get(x);
				S.remove(x);
			}else{
				int L = sc.nextInt();
				int R = sc.nextInt();
				SortedMap<Integer, Integer> SS = S.subMap(L, R + 1);
				for(Integer num : SS.keySet()){
					for(int j = 0; j < SS.get(num); j++) System.out.println(num);
				}
			}
		}
	}
}

