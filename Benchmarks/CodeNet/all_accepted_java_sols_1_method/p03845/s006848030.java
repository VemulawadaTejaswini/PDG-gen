import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] t = new int[n+1];
      	t[0] = 0;
		for(int i=1; i<n+1; i++){
			t[i] = scn.nextInt();
		}
      	int sum = 0;
      	for(int i=0; i<n+1; i++){
          sum += t[i];
        }
      	int m = scn.nextInt();
		int[] p = new int[m+1];
      	p[0] = 0;
      	int[] x = new int[m+1];
      	x[0] = 0;
		for(int i=1; i<m+1; i++){
			p[i] = scn.nextInt();
          	x[i] = scn.nextInt();
		}
      	int dif = 0;
      	for(int i=1; i<m+1; i++){
          dif = t[p[i]]-x[i];
          System.out.println(sum-dif);
        }
	}
}
