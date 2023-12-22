
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		while(true){
			int n = sn.nextInt();
			int m = sn.nextInt();
			if(n == 0 && m == 0) break;
			ArrayList<Integer> vegies = new ArrayList<Integer>();
			for(int i = 0; i < n; i++){
				vegies.add(sn.nextInt());
			}
			Collections.sort(vegies);
			Collections.reverse(vegies);

			int sum = 0;
			for(int i = 0; i < n; i++){
				if((i+1)%m != 0) sum += vegies.get(i);
			}
			System.out.println(sum);
		}
	}
}