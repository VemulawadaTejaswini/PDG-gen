import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] bunny=new int [N+1];
        int[] count=new int[N+1];
        int K, m, num, R, p, q, sum=0;
        K = sc.nextInt();
        for(int i=0; i<K; i++) {
        	m= sc.nextInt();
        	for(int j=0; j<m; j++) {
        		num = sc.nextInt();
        		bunny[num] = i;
        	}
        }
        R = sc.nextInt();
        for(int i=0; i<R; i++) {
        	p = sc.nextInt();
        	q = sc.nextInt();
        	if(bunny[p] == bunny[q]) {
        		count[p]=1;
        		count[q]=1;
        	}
        }
        for(int i=1; i<=N; i++){
            sum += count[i];
        }
        	System.out.printf("%d", sum);
	}
}
