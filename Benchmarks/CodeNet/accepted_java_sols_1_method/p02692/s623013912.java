import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] types = new int[n];
		for (int i = 0; i < n; i++) {
		    String s = sc.next();
		    if (s.equals("AB")) {
		        types[i] = 0;
		    } else if (s.equals("AC")) {
		        types[i] = 1;
		    } else {
		        types[i] = 2;
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    switch (types[i]) {
		        case 0:
		            if (a == 0) {
		                if (b == 0) {
		                    System.out.println("No");
		                    return;
		                }
		                a++;
		                b--;
		                sb.append("A");
		            } else if (b == 0) {
		                b++;
		                a--;
		                sb.append("B");
		            } else {
		                if (i != n - 1 && types[i + 1] == 2) {
		                    b++;
		                    a--;
		                    sb.append("B");
		                } else {
		                    a++;
		                    b--;
		                    sb.append("A");
		                }
		            }
		            break;
		        case 1:
		            if (a == 0) {
		                if (c == 0) {
		                    System.out.println("No");
		                    return;
		                }
		                a++;
		                c--;
		                sb.append("A");
		            } else if (c == 0) {
		                c++;
		                a--;
		                sb.append("C");
		            } else {
		                if (i != n - 1 && types[i + 1] == 2) {
		                    c++;
		                    a--;
		                    sb.append("C");
		                } else {
		                    a++;
		                    c--;
		                    sb.append("A");
		                }
		            }
		            break;
		        case 2:
		            if (b == 0) {
		                if (c == 0) {
		                    System.out.println("No");
		                    return;
		                }
		                b++;
		                c--;
		                sb.append("B");
		            } else if (c == 0) {
		                c++;
		                b--;
		                sb.append("C");
		            } else {
		                if (i != n - 1 && types[i + 1] == 0) {
		                    b++;
		                    c--;
		                    sb.append("B");
		                } else {
		                    c++;
		                    b--;
		                    sb.append("C");
		                }
		            }
		            break;
		    }
		    sb.append("\n");
		}
		System.out.println("Yes");
		System.out.print(sb);
	}
}
