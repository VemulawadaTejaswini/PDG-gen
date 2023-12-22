import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] cards = new int[N];
		for(int i=0;i<N;i++) {
			cards[i] = sc.nextInt();
		}
		Arrays.sort(cards);
		int sum=0;
		for(int j=N;j>1;j=j-2) {
			sum += cards[j-1] -cards[j -2];
		}
		if(N % 2 == 1)sum+=cards[0];
		
		System.out.println(sum);
	}
}
