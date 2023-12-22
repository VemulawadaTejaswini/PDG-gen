import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] d = new int[n];
		for(int i=0; i<n; i++){
			d[i] = scn.nextInt();
		}
      	int sum = 0;
      	for(int i=0; i<n-1; i++){
          for(int j=i+1; j<n; j++){
            sum += d[i]*d[j];
          }
        }
      	System.out.println(sum);
	}
}
