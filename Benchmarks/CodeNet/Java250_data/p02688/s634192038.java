
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K =sc.nextInt();
        int[] d = new int[K];
        int[] A = new int[N];
        boolean[] Sunuke = new boolean[N];
        int ans = 0;
        
        for(int i = 0; i < K; i++) {
        	d[i] = sc.nextInt();
        	for(int j = 0; j < d[i]; j++) {
        		A[j] = sc.nextInt();
        		Sunuke[A[j]-1] = true;
        	}
        }
        
        for(int i = 0; i < N; i++) {
        	if(Sunuke[i] == false) ans++; 
        }
        
        System.out.println(ans);

 

        
        }
	}

