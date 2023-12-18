import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] as = new int[n];
		for(int i=0; i<n; i++){
			as[i] = sc.nextInt();
		}
		boolean[] hantei = new boolean[1000001];
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer key : as) {
    		Integer i = map.get(key);
    		map.put(key, i == null ? 1 : i + 1);
		}

		for (Map.Entry<Integer, Integer> i : map.entrySet()) {
			int ik = i.getKey();
			int iv = i.getValue();
			if(iv >= 2){
				int j = 2;
				int tmp = ik;
				while(tmp <= 1000000){
					hantei[tmp] = true;
					tmp = ik*j;
					j++;
				}
			} else if(iv >= 1){
				int j = 2;
				int tmp = ik*j;
				while(tmp <= 1000000){
					hantei[tmp] = true;
					j++;
					tmp = ik*j;
				}
			}
		}

		int ans = 0;
		for(int a: as){
			if(!hantei[a]) ans++;
		}
		System.out.println(ans);

	}
}
