import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N = cin.nextInt();
			if(N==0){
				break;
			}
			int[] a = new int[N];
			
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int i = 0;i < N;i++){
				a[i]=cin.nextInt();
				if(map.containsKey(a[i])){
					map.put(a[i], map.remove(a[i])+1);
				}
				else{
					map.put(a[i], 1);
				}
			}
			int count=0;
			while(true){
				count++;
				HashMap<Integer, Integer> ne = new HashMap<Integer, Integer>();
				int[] next = new int[N];
				for(int i = 0; i < N;i++){
					next[i]=map.get(a[i]);
					if(ne.containsKey(next[i])){
						ne.put(next[i], ne.remove(next[i])+1);
					}
					else{
						ne.put(next[i], 1);
					}
				}
				if(Arrays.equals(a, next)){
					break;
				}
				else{
					a = next;
					map = ne;
				}
				
			}
			System.out.println(count-1);
			System.out.print(a[0]);
			for(int i = 1; i < N;i++){
				System.out.print(" "+a[i]);
			}
			System.out.println();
		}

	}
}