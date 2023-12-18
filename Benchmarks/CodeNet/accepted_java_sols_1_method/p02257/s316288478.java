import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		prime.add(3);
		prime.add(5);
		prime.add(7);

		boolean sieve2[] = new boolean[100];
		Arrays.fill(sieve2, true);
		int j = 0;
		for(int i=0; i<prime.size(); i++){
			j = prime.get(i)-1;
			while(j<100){
				sieve2[j] = false;
				j += prime.get(i);
			}
		}
		sieve2[0] = false;

		for(int i=0; i<100; i++){
			if(sieve2[i]){prime.add(i+1);}
		}

		boolean sieve3[] = new boolean[10000];
		Arrays.fill(sieve3, true);
		for(int i=0; i<prime.size(); i++){
			j = prime.get(i)-1;
			while(j<10000){
				sieve3[j] = false;
				j += prime.get(i);
			}
		}
		sieve3[0] = false;
		for(int i=0; i<10000; i++){
			if(sieve3[i]){prime.add(i+1);}
		}


		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.next());
		int search = 0;
		int answer = n;
		j = 0;
		for(int i=0; i<n; i++){
			search = Integer.parseInt(std.next());

			while(search >= prime.get(j)*prime.get(j)){
				if(search%prime.get(j) == 0){
					answer--;
					break;
				}else{
					j++;
					if(j>=prime.size()){break;}
				}
			}
			j = 0;
		}
		System.out.println(answer);
	}
}