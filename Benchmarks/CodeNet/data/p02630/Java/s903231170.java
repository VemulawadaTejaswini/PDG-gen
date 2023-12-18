import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long n = sc.nextLong();
	int x=26,a=1;
	while (x+Math.pow(26, a+1)<=n) {
		a++;
		x+=Math.pow(26, a);
	}
	if (x==n) {
		for (int i=0;i<a;i++) {
			System.out.print('z');
		}
	}
	else {
		String s = "";
		while (n>26)  {
			s+=(char) ((n%26)+96);
			n/=26;
		}
		s+=(char) (n+96);
		for (int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
	sc.close();}}