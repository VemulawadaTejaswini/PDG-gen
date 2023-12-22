import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
            y[i] = x[i];
        }
		Arrays.sort(x);
		for(int i=0; i<n; i++){
			System.out.println(y[i]<=x[(n-1)/2]? x[(n-1)/2+1]:x[(n-1)/2]);
		}
	}
}