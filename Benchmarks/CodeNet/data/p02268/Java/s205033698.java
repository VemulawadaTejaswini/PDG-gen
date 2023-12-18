import java.util.Scanner;
public class Main {
private static Scanner s;

public static void main(String[] args) {
	s = new Scanner(System.in);
	int a = s.nextInt();
	int[] b = new int[a];
	for(int i = 0;i < a;i++) {
		b[i] = s.nextInt();
	}

	int c = s.nextInt();
	int[] d = new int[c];
	for(int i = 0;i < c;i++) {
		d[i] = s.nextInt();
	}
	int count = 0;

	for(int i = 0;i < c;i++) {
	int l = 0,r = a,m;
	while(l < r) {
		m = (l+r)/2;
		if(d[i] == b[m]) {
			count++;
			break;
		}else if(d[i] < b[m]) {
			r = m;
		}else {
			l = m + 1;
		}
	}
	}
	System.out.println(count);
}
}

