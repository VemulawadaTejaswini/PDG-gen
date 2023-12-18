import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<Integer> prime = new ArrayList<Integer>();
		prime.add(2); prime.add(3);
		int[] check = new int[50001];
		check[2] = 1; check[3] = 1;
		
	outer:	for(int i = 5; i < 50000; i += 2){
			for(int j = 1; prime.get(j) <= Math.sqrt(i); j++){
				if( i%prime.get(j) == 0 ){
					continue outer;
				}
			}
			prime.add(i);
			check[i] = 1;			
		}
		
		List<Integer> result = new ArrayList<Integer>();
		int n = stdIn.nextInt();
		while( n != 0 ){
			if( n%2 != 0 ){
				if( check[n-2] == 1 ){
					result.add(1);
				} else {
					result.add(0);
				}
			
			} else {
				int sum = 0;
				int index = 0;
				while( prime.get(index) <= n/2 ){
					if( check[n-prime.get(index)] == 1 ){
						sum++;
					}
					index++;
				}
				result.add(sum);
			}
			n = stdIn.nextInt();
		}
		for(Integer sum : result){
			System.out.println(sum);
		}
	}
}