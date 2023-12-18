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

        //disp
    	disp(A);

        for (int i = 1; i < n; i++) {
        	//ex. 5,3 = 3
        	int v = A[i];
        	//ex. 5,3 = 5
        	int j = i -1;

        	//              5  > 3
        	while(j>=0 && A[j] > v){
        		A[j+1] = A[j];
        		j--;
        	}
        	A[j+1] = v;

        	//disp
        	disp(A);


		}
	}

	private static void disp(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if(i!=a.length-1)System.out.print(" ");
		}
		System.out.println();
	}

}