import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			String a = cin.next();
			
			int L = cin.nextInt();
			if(L==0){
				break;
			}
			int count=0;
			while(true){
				for(;a.length() < L;){
					a += "0";
				}
				if(map.containsKey(Integer.parseInt(a))){
					System.out.println(map.get(Integer.parseInt(a)) + " " + Integer.parseInt(a) + " " + (count-map.get(Integer.parseInt(a))));
					break;
				}
				else{
					map.put(Integer.parseInt(a), count++);
				}
				char[] min = a.toCharArray();
				Arrays.sort(min);
				char[] max = new char[L];
				for(int i = 0; i < L;i++){
					max[i] = min[L-i-1];
				}
				//System.out.println(max);
				//System.out.println(min);
				int c = Integer.parseInt(String.valueOf(max))
						- Integer.parseInt(String.valueOf(min));
				a = String.valueOf(c);
			}
		}
	}

}