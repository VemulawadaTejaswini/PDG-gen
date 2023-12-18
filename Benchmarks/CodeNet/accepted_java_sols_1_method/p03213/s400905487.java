import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=2;i<=n;i++) {
			int num = i;
			for(int j=2;j*j<=num;j++) {
				if(j*j==num) {
					map.put(j, map.get(j).intValue()+2);
					num = 1;
				}else {
					while(num%j==0) {
						num /= j;
						if(map.containsKey(j)) {
							map.put(j, map.get(j).intValue()+1);
						}else {
							map.put(j, 1);
						}
					}
				}
			}
			if(num>1) {
				if(map.containsKey(num)) map.put(num, map.get(num).intValue()+1);
				else map.put(num, 1);
			}
		}
		int up74 = 0;
		int up24 = 0;
		int up14 = 0;
		int up4 = 0;
		int up2 = 0;
		for(int key:map.keySet()) {
			int val = map.get(key);
			if(val>=74) up74++;
			if(val>=24) up24++;
			if(val>=14) up14++;
			if(val>=4) up4++;
			if(val>=2) up2++;
		}
		
		int ans = 0;
		ans += up74;
		ans += up24*(up2-1);
		ans += up14*(up4-1);
		ans += (up2-2)*up4*(up4-1)/2;
		System.out.println(ans);
	}

}
