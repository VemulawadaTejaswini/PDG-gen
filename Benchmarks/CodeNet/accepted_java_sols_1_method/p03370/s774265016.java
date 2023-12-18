import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int m[] = new int[n];
		int sum = 0;
		for(int i=0; i<n; i++){
			m[i] = sc.nextInt();
			sum += m[i];
		}
		int min = m[0];
		for(int i=1; i<n; i++){
			if(m[i] < min)min = m[i];
		}
		System.out.println(n+((x - sum)/min));
	}
}