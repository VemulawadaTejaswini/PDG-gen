import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
        int n = sc.nextInt();
        String data = sc.next();

        //String???Int????????????
        String[] datas = data.split(" ");
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(datas[i]);
		}

    	bubble(A);
	}

	/**
	 * ??????????????????
	 * @param a
	 */
	private static void bubble(int[] A) {
		int cnt = 0;
		//??°???????????¢????????????????´?
		boolean flag = true;
		for(int i=0; flag==true; i++){
			flag = false;
			for(int j= A.length-1; j>=i+1; j--){
				if(A[j-1] > A[j]){
					int tmp = A[j-1];
					A[j-1] = A[j];
					A[j] = tmp;
					cnt++;
					flag = true;
				}
			}
		}
		disp(A);
		System.out.println(cnt);

	}

	private static void disp(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i!=a.length-1)System.out.print(" ");
		}
		System.out.println();
	}

}