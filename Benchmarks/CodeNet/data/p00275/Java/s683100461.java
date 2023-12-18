import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int decks = 100;
		int[] deck = new int[decks];
		
		while(true){
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			char[] input = sc.next().toCharArray();
			for(int i = 0; i < decks; i++){
				if(input[i] == 'M'){
					deck[i] = 0;
				}else if(input[i] == 'S'){
					deck[i] = 1;
				}else if(input[i] == 'L'){
					deck[i] = 2;
				}
			}
			
			int field = 0;
			int[] player = new int[N];
			
			for(int i = 0; i < decks; i++){
				final int play = i % N;
				
				if(deck[i] == 0){
					player[play]++;
				}else if(deck[i] == 1){
					field += player[play] + 1;
					player[play] = 0;
				}else if(deck[i] == 2){
					player[play] += field + 1;
					field = 0;
				}
			}
			
			Arrays.sort(player);
			for(int i = 0; i < N; i++){
				if(i != 0){
					System.out.print(" ");
				}
				
				System.out.print(player[i]);
			}
			System.out.println(" " + field);
		}
	}

}