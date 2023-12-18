import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		boolean[] prime = new boolean[100001];
		boolean[] like = new boolean[100001];
		Arrays.fill(prime, true); prime[0] = false; prime[1] = false;
		Arrays.fill(like, false);
		for(int i = 2; i < prime.length; i++) {
			if(prime[i]) for(int j = 2; j * i < prime.length; j++) prime[j * i] = false;
		}
		for(int i = 3; i < prime.length; i += 2) {
			if(prime[i] && prime[(i + 1) / 2]) like[i] = true;
		}
		int[] query = new int[100001];
		for(int i = 1; i < query.length; i++) query[i] += query[i - 1] + ((like[i]) ? 1 : 0);
		int Q = sc.nextInt();
		while(Q > 0) {
			Q--;
			int l = sc.nextInt(), r = sc.nextInt();
			System.out.println(query[r] - query[l - 1]);
		}
	}
}