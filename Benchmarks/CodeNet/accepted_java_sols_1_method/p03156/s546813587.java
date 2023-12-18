import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] P = new int[N];
        int Ap = 0;
        int ABp = 0;
        int Bp = 0;
        for(int i=0;i<N;i++) {
        	P[i] = sc.nextInt();
        	if(P[i]<=A) {
        		Ap++;
        	}
        	if(P[i] >= A+1 && P[i] <=B) {
        		ABp++;
        	}
        	if(P[i] >= B+1) {
        		Bp++;
        	}
        }
        
        int ans = Math.min(Math.min(Ap, ABp), Math.min(ABp, Bp));

        System.out.println(ans);
        
        sc.close();
    }
}
