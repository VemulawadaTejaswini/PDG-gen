import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int[] tmp = new int[n];
			int[] map = new int[1000];
			for(int i = 0; i< n; i++) {
				tmp[i] = stdIn.nextInt();
			}
			int counter = 0;
			while(true) {
				map = new int[1000];
				for(int i = 0; i < n; i++) {
					
					map[tmp[i]]++;
					
				}
				boolean change = false;
				for(int i = 0; i < n; i++) {
					if(tmp[i] != map[tmp[i]]) {
						tmp[i] = map[tmp[i]];
						change = true;
					}
				}
				if(!change) {
					break;
				}
				counter++;
			}
			System.out.println(counter);
			System.out.print(tmp[0]);
			for(int i = 1; i < n; i++) {
				System.out.print(" "+tmp[i]);
			}
			System.out.println();
		}
		
	}

}