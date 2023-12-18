import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			final int V = sc.nextInt();
			final int D = sc.nextInt();
			
			if(V == 0 && D == 0){
				break;
			}
			
			int fibs[] = new int[V+1];
			
			BigInteger[] bfi = new BigInteger[V+1];
			BigInteger mod = new BigInteger("1001");
			
			bfi[0] = new BigInteger("1");
			bfi[1] = new BigInteger("2");
			for(int i = 2; i <= V; i++){
				bfi[i] = bfi[i-1].add(bfi[i-2]);
			}
			
			for(int i = 1; i <= V; i++){
				fibs[i] = bfi[i].mod(mod).intValue();
			}
			
			Arrays.sort(fibs);
			
			int count = 0;
			
			for(int i = 1; i <= V; i ++){
				if(i != 1 && fibs[i-1] + D <= fibs[i]){
					count++;
				}
				
				
				//System.out.println(count + " " + fibs[i] + " " + (fibs[i] - fibs[i-1]));
			}
			
			
			System.out.println(count + 1);
			
		}
	}

}