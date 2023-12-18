import java.util.Scanner;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] H = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] C = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] D = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i=0; i<n; i++) {
        		String a = sc.next();
        		int b = sc.nextInt();
        		switch (a) {
        			case "S": S[b-1] = b; break;
        			case "H": H[b-1] = b; break;
        			case "C": C[b-1] = b; break;
        			case "D": D[b-1] = b; break;
        		}
        }
        for(int i=0; i<S.length; i++) {
        		if(S[i] == 0) {
        			System.out.println("S " + (i+1));
        		}
        }
        for(int i=0; i<H.length; i++) {
    			if(H[i] == 0) {
    				System.out.println("H " + (i+1));
    			}
        }
        for(int i=0; i<C.length; i++) {
			if(C[i] == 0) {
				System.out.println("C " + (i+1));
			}
        }
        for(int i=0; i<D.length; i++) {
			if(D[i] == 0) {
				System.out.println("D " + (i+1));
			}
        }
    }
}
