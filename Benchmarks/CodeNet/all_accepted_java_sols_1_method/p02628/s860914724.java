import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();	// N種類の果物
        int K = in.nextInt();	// K種類の果物
        int p[] = new int[N];
		for(int i = 0; i<N; i++)
			p[i] = in.nextInt();	// 果物一個あたりの価格
		int sum = 0;
      
        Arrays.sort(p);
		for(int i = 0; i<K; i++)
			sum += p[i];
		System.out.println(sum);
	}
}