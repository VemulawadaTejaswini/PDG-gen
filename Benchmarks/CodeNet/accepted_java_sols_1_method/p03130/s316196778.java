import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		for (int i=0;i<3;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}

		int[] c = new int[4];
		for (int i=0;i<3;i++) {
			switch (a[i]) {
			case 1:c[0]++;
			break;
			case 2:c[1]++;
			break;
			case 3:c[2]++;
			break;
			case 4:c[3]++;
			break;
			}
		}
		for (int i=0;i<3;i++) {
			switch (b[i]) {
			case 1:c[0]++;
			break;
			case 2:c[1]++;
			break;
			case 3:c[2]++;
			break;
			case 4:c[3]++;
			break;
			}
		}
		int cnt = 0;
		for(int i=0;i<4;i++) {
			if (c[i]%2==0) {
				cnt++;
			}
		}
		if (cnt==2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}