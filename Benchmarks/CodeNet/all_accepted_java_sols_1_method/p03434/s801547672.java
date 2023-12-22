import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] card= new int[n];
		for(int i = 0; i < n; i++){
			card[i] = sc.nextInt();
		}
		Arrays.sort(card);
		int alice = 0;
		int bob = 0;
		for(int i = card.length - 1; i >= 0; i--){
			alice += card[i];
			i--;
			if(i >= 0){
				bob += card[i];
			}
		}
		System.out.println(alice - bob);
 	}
}


