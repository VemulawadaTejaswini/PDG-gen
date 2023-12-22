import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer buf = new StringBuffer();
		int[] p = {2,11,31,41,61,71,101,131,151,181,191,211,251,271,311,331,401,421,431,461,491,521,541,571,601,631,641,661,691,701,751,761,811,821,881,911,941,971,991,1021,1031,1051,1061,1091,1151,1171,1181,1201,1231,1361,1381,1451,1571,1831,2311,2711,2851,2791};
		int N =sc.nextInt();
		String ans="";
		if(N%2==0) {
			for(int i = 0;i<N;i++) {
				buf.append(p[i]);
				buf.append(" ");
			}
		}else {
			for(int i = 1;i<N+1;i++) {
				buf.append(p[i]);
				buf.append(" ");
			}
		}
		ans = buf.toString();
		System.out.println(ans);
		sc.close();
	}
}
