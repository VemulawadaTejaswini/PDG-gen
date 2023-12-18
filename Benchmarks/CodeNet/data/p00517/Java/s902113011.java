

import java.util.*;

public class Main {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);

	int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int E = sc.nextInt();
    int F = 0;

    for(int i = 1; C > i ; i++) {
        int G = sc.nextInt();
        int H = sc.nextInt();

        if((D > G && E < H) || (D < G && E > H)) {
            F = F + Math.abs(D - G) + Math.abs(E - H);
	    }else{
	         F = F + Math.max(Math.abs(D - G), Math.abs(E - H));
	    }
	    D = G;
	    E = H;
	}
    System.out.println(F);
    sc.close();
}
}