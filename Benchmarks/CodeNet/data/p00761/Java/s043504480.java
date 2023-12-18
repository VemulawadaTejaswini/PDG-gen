import java.util.HashMap;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		HashMap<Integer, Integer> map;
		while(true){
			map = new HashMap<Integer, Integer>();
			int a = in.nextInt();
			int l = in.nextInt();
			if(l==0) break;
			int idx = 0;
			map.put(a, idx);
			a = culcNext(a, l);
			idx++;
			while(!map.containsKey(a)){
				map.put(a, idx);
				a = culcNext(a, l);
				idx++;
			}
			System.out.println(map.get(a)+" "+a+" "+(idx-map.get(a)));
		}
	}
	
	public static int culcNext(int a, int l){
		char[] al = new char[l];// a large
		int[] count = new int[10];
		char[] as = new char[l];// a small
		while(a > 0){
			count[a%10]++;
			a /= 10;
		}
		int idx = 9;
		for(int i=0; i<l; i++){
			while(idx > 0 && count[idx] == 0) idx--;
			al[i] = (char)(idx + '0');
			as[l-1-i] = al[i];
			count[idx]--;
		}
		return Integer.valueOf(String.valueOf(al)) - Integer.valueOf(String.valueOf(as));
	}
}