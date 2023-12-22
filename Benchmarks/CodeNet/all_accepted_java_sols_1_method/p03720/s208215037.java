import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int m = scn.nextInt();
		int[] x = new int[n];
      	int a = 0;
      	int b = 0;
		for(int i=0; i<m; i++){
			a = scn.nextInt()-1;
          	b = scn.nextInt()-1;
          	x[a]++;
          	x[b]++;
		}
      	for(int i=0; i<n; i++) {
      		System.out.println(x[i]);
    	}
	}
}
