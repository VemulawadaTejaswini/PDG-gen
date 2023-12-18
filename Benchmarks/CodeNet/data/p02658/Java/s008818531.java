import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	long ans=1;
	boolean d = false;
	while (n!=0) {
		n--;
		long x = scanner.nextLong();
		ans*=x;
		if (ans>1000000000000000000L||ans<0) {
			d=true;
			break;
		}
	}
	if (d) System.out.println(-1);
	else System.out.println(ans);
	scanner.close();}}