import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //500yen
		int b = sc.nextInt(); //100yen
		int c = sc.nextInt(); //50yen
		int x = sc.nextInt(); //all
		int ans = 0;
		
		for(int i=0; i<a+1; i++) {
			for(int j=0; j<b+1; j++) {
				for(int k=0; k<c+1; k++) {
					if(i*500 + j*100 + k *50 == x) {
						ans++;
					}
				}
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
