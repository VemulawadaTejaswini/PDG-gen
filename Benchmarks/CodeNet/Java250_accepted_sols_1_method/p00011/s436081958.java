import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w, n, a, b, tmp;
		String[] s;
		int[] table;
		while(sc.hasNext()){
			w = sc.nextInt();
			table = new int[w + 1];
			for(int i = 0; i <= w; i++){
				table[i] = i;
			}
			n = sc.nextInt();
			for(int i = 0; i < n; i++){
				s = sc.next().split(",");
				a = Integer.parseInt(s[0]);
				b = Integer.parseInt(s[1]);
				tmp = table[a];
				table[a] = table[b];
				table[b] = tmp;
			}
			
			for(int i = 1; i <= w; i++){ 
				System.out.println(table[i]);
			}
		}
	}
}