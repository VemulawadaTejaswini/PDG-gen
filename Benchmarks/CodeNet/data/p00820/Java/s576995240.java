import java.util.*;
public class Main { 
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		makeList();
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int count = 0;
			for(int i = 0; i < 182; i++) {
				int a = list.get(i);
				if(a > n) break;
				for(int j = i; j < 182; j++) {
					int b = list.get(j);
					if(a + b > n) break;
					for(int k = j; k < 182; k++) {
						int c = list.get(k);
						if(a + b + c > n) break;
						for(int l = k; l < 182; l++) {
							if(a + b + c + list.get(l) == n) {
								count++;
								break;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	public static void makeList() {
		for(int i = 0; i < 182; i++) {
			list.add(i*i);
		}
	}
		
}