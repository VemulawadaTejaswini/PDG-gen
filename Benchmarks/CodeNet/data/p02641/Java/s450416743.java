import java.util.Arrays;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x =sc.nextInt(),n=sc.nextInt();
	if (n==0) System.out.println(x);
	else {
		int [] a = new int [n];
		boolean d = true;
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if (a[i]==x) d=false;
		}
		if (d) System.out.println(x);
		else {
			for (int i=1;i<110;i++) {
				boolean  f = true;
				for (int j=0;j<n;j++) {
					if (x-i==a[j]) {f=false;break;}
				}
				if (f) {System.out.println(x-i);break;}
				f=true;
				for (int j=0;j<n;j++) {
					if (x+i==a[j]) {f=false;break;}
				}
				if (f) {System.out.println(x+i);break;}
			}
		}
		
	}
	sc.close();}}
