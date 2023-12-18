import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n>36) {System.out.println(0);}
			else if (n==36) {System.out.println(1);}
			else {
				int count = 0;
				for (int i=0; i<=9; i++) {
					for (int j=0; j<=9; j++) {
						for (int k=0; k<=9; k++) {
							for (int m=0; m<=9; m++) {
								if (i+j+k+m==n) {count++;}
							}
						}
					}
				}
				System.out.println(count);
			}
		}
	}
}
