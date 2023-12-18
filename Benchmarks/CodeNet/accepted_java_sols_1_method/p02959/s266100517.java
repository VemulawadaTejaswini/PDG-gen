import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] numMonsters = new int[N+1];
		int[] capasityHero = new int[N];		
		for(int i=0;i<N+1;i++) {
			numMonsters[i] = sc.nextInt();
		}		
		for(int i=0;i<N; i++) {
			capasityHero[i] = sc.nextInt();
		}
		
		long sum = 0;
		for(int i=0;i<N;i++) {
			sum += Math.min(numMonsters[i], capasityHero[i]);
			int extra = Math.max(0, capasityHero[i] - numMonsters[i]);
			sum += Math.min(numMonsters[i+1], extra);
			numMonsters[i+1] =  Math.max(0, numMonsters[i+1] - extra);
		}
		
		System.out.println(sum);
		
		sc.close();	
	}
 
}