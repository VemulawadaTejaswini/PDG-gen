import java.util.*;

public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] f = new int[10002];
	for (int x=1; x<100; x++) {
	    for (int y=1; y<100; y++) {
		for (int z=1; z<100;z++) {
		    if (x*x + y*y + z*z + x*y + y*z + z*x > 10001) break;
		    f[x*x + y*y + z*z + x*y + y*z + z*x] += 1;
		    
		}	
	    }
	}
	
	for (int i=1;i<=N;i++) {
	    System.out.println(f[i]);
	}
    }
}