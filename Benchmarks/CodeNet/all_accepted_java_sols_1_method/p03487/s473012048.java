import java.util.HashMap;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   HashMap <Integer, Integer>hm = new HashMap<Integer,Integer>();
	   
	   int n = sc.nextInt();
	   
	   for(int i =  0; i < n ;i++) {
		   int a = sc.nextInt();
		   if(!hm.containsKey(a)) {
			   hm.put(a, 1);
		   }
		   else {
			   hm.put(a, hm.get(a) + 1);
		   }
	   }
	   
	   int ans = 0;
		   
	   for(int num : hm.keySet()) {
		   if(num > hm.get(num)) {
			   ans += hm.get(num);
		   }
		   if(num <= hm.get(num)) {
			   ans += (hm.get(num) - num);
		   }
	   }

	   System.out.println(ans);

	}
}
