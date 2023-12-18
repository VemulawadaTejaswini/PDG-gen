import java.util.Arrays;
import java.util.Scanner;
public class Main {
	int as,kl,o,n,m,hun,p;
	String op;
	Scanner sc = new Scanner(System.in);
	public void solve() {	
n=sc.nextInt();
int[] date=new int[n];
for(o=0;o<n;o++) {
	date[o]=sc.nextInt();
}
Arrays.sort(date);
for(o=1;o<n;o++) {
	as=date[o]+as;
	
}
System.out.println(as);
	}
	public static void main(String[] args) {
		new Main().solve();
	
	}
}