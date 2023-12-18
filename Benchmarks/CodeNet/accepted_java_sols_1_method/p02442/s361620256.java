import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			boolean flag = false;
			//arrayを配置
			int n = sc.nextInt();
			int[] array1 = new int[n];
			for (int i=0; i<n; i++) array1[i] = sc.nextInt();
			int m = sc.nextInt();
			int[] array2 = new int[m];
			for (int i=0; i<m; i++) array2[i] = sc.nextInt();
			//-------------------------------------------------------
			for (int i=0; i<Math.min(n,m);i++) {
				if (array1[i] != array2[i]) {
					System.out.println(array1[i] >= array2[i]? '0':'1');
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println( n>=m ? '0':'1');
			}
		}
	}
}
