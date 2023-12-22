import java.util.*;
public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int table[] = new int[N];
		int orgtab[] = new int[N];
		int parity = 0;
		for(int i = 0; i<N; i++) {
			table[i] = sc.nextInt();
			orgtab[i] = table[i];
		}
 
		Arrays.sort(table);
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i<N; i++) {
			map.put(table[i],i);
		}
 
		for(int i = 0; i<N; i+=2) {
			int a = (map.get(orgtab[i]))%2;
			parity += a;
		}
		System.out.println(parity);
		
	}
}
