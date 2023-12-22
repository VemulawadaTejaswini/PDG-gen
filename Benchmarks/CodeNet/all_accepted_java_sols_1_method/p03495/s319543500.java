import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer>hm = new HashMap<Integer, Integer>();
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i = 0; i< n ; i++) {
			int a = sc.nextInt();
			if(!hm.containsKey(a)) {
				hm.put(a,1);
			}
			else {
				hm.put(a, hm.get(a) + 1);
			}
		}
		
		sc.close();
		int p = hm.size();
		int []b = new int [p];
		int j = 0;
		
		for(int num : hm.keySet()) {
		    b[j] = hm.get(num);
		    j++;
		}
		
		Arrays.sort(b);
		
		int ans = 0;
		int temp = p;
		for(int i = 0 ; i < p; i++) {	
		if(k < temp) {
				ans += b[i];
				temp--;
		}
		else {
			break;
		}
		
	}
		System.out.println(ans);
	}

}
