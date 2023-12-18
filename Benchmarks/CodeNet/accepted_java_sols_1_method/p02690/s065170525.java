import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		for (long i=1;i<1000;i++) {
			for (long j=-1000;j<i;j++) {
				long tmp = i*i*i*i*i-j*j*j*j*j;
				if (tmp == X) {
					System.out.println(i+" "+j);
					return;
				}
			}
		}
	}
}