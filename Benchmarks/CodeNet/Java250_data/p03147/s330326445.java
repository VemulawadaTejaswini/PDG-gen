import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] h = new int[N];
	int hMax = 0;
	for(int i = 0; i<N; i++) {
	    h[i] = sc.nextInt();
	    hMax = Math.max(h[i], hMax);
	}

	int height = 0;
	int shima = 0;
	for(int k = 0; k<hMax; k++) {
	    boolean isConnect = false;
	    for(int i = 0; i<N; i++) {
		if(h[i]-height > 0 ) {
		    if(isConnect == false) shima++;
		    isConnect = true;
		}else {
		    isConnect = false;
		}
	    }
	    height++;
	}
	System.out.println(shima);
    }
}