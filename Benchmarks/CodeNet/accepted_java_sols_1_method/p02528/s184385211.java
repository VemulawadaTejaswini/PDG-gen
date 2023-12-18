import java.util.*;

/* No.10028 */
//\[gÌASYÌâè¾Æðßµ½½ßCollectionNXÍ¢gp
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[1000];
		int n = sc.nextInt();
		for ( int i = 0; i < n; i++ )
			data[i] = sc.nextInt();
		for ( int i = 1; i < n; i++ ) {
			int tmp = data[i];
			if ( data[i-1] > tmp ) {
				int j = i;
				while( j > 0 && data[j-1] > tmp ) {
					data[j] = data[j-1];
					j--;
				}
				data[j] = tmp;
			}
		}
		for ( int i = 0; i < n-1; i++ )
			System.out.print(data[i]+" ");
		System.out.println(data[n-1]);
	}
}