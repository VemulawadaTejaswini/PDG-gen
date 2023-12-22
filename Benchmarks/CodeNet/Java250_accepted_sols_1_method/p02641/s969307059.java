import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
if(n==0){System.out.println(x);}else{
		int p[] = new int[n];
		int q[] = new int[102 - n];
		q[0] = 0;
		q[101 - n] = 101;
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		Arrays.sort(p);
		int look = 0;
		int lookb = 0;
		for (int i = 0; i <= 101; i++) {
			if (!(p[lookb] == i)) {
				// System.out.println("!"+i);
				q[look] = i;
				look++;

			} else {
				lookb++;
				if (lookb >= n) {
					lookb--;
				}
			}
		}
/*		for (int i = 0; i < q.length; i++) {
			System.out.println(q[i]);
		}
*/
		int sub=x;
		int ans=0;
for(int i=0;i<q.length;i++){
if(sub>Math.abs(q[i]-x)){
	sub=Math.abs(q[i]-x);
	ans=q[i];
}
}System.out.println(ans);
}
	}
}