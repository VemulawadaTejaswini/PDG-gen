import java.util.*;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb;
		int rr = sc.nextInt();
		int cc = sc.nextInt();
		sc.nextLine();
		char[][] res = new char[rr+2][cc+2];
		String temp = "";
		for(int i=0; i<rr+2; i++) {
			sb = new StringBuilder();
			if(i>0 && i<rr+1) temp = sc.nextLine();
			for(int j=0; j<cc+2; j++) {
				if(i==0 || j==0 || i==rr+1 || j==cc+1) {
					sb.append('#');
				}
				else {
					sb.append(temp.charAt(j-1));
				}
			}
			System.out.println(sb.toString());
		}
	}
}