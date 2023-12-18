import java.util.Scanner;
public class Main {
	private static Scanner s = new Scanner(System.in);
public static void main(String[] args) {
	int n = s.nextInt();
	int[] a = new int[n+1];
	StringBuilder sb = new StringBuilder();

	for(int i = 1;i <= n;i++) {
		a[i] = s.nextInt();
	}

	for(int i = 1;i <= n;i++) {
		sb.append("node "+i+": key = "+ a[i] + ",");
		if(i/2 >= 1) {
			sb.append(" parent key = " + a[i/2] + ",");
		}
		if(i*2 <= n) {
			sb.append(" left key = " + a[i*2] +",");
		}
		if((i*2+1) <= n) {
			sb.append(" right key = " + a[i*2+1] + ",");
		}
		sb.append("\n");
	}
	System.out.print(sb);
}
}

