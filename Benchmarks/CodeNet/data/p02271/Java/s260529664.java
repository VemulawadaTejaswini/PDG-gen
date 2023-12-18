import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
		int n = sc.nextInt();
        String aStr = sc.next();
        int[] a = toIntAry(aStr, n);
        int q = sc.nextInt();
        String mStr = sc.next();
        int[] m = toIntAry(mStr, q);


        for (int i = 0; i < q; i++) {
			if(solve(0,m[i],n,a)){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}

	}



	private static boolean solve(int i, int m, int n, int[] a) {
		if(m==0) return true;
		if(i>=n) return false;
		boolean res = solve(i+1,m,n,a) || solve(i+1,m-a[i],n,a);
		return res;
	}



	private static int[] toIntAry(String str, int n) {
        String[] tmp = str.split(" ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(tmp[i]);
		}
        return A;
	}


}