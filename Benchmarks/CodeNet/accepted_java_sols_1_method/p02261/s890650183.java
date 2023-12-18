import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String In1[] = new String[n];
		int In2[] = new int[n];
		String N1b[] = new String[n];
		int N2b[] = new int[n];
		String N1s[] = new String[n];
		int N2s[] = new int[n];
		int count = 0;
		int minj = 0;
		int l, i, j = 0;
		
		for (int k = 0; k <= n - 1; k++) {
			String x = scanner.next();
			String y = x.substring(0, 1);
			String z1 = x.substring(1, 2);
			int z = Integer.parseInt(z1);
			In1[k] = y;
			In2[k] = z;			
			N1b[k] = y;
			N2b[k] = z;
			N1s[k] = y;
			N2s[k] = z;
			
		} //ここまでで配列に要素を入れる

		//bubble sort
        for (i = 0; i < n - 1; i++) {
            for (j = n - 1; j > i; j--) {
                if (N2b[j] < N2b[j-1]) {
                    int a = N2b[j - 1];
                    N2b[j - 1] = N2b[j];
                    N2b[j] = a;
                    
                    String b = N1b[j - 1];
                    N1b[j - 1] = N1b[j];
                    N1b[j] = b;
                }
            }
        }
        for (int k = 0; k < n - 1; k++) {
            System.out.print (N1b[k] + N2b[k] + " ");
            }
        System.out.println (N1b[n - 1] + N2b[n - 1]);
        System.out.println("Stable");
 
    //selection sort
    for (i = 0; i <= n - 1; i++) {
        minj = i;
        for (j = i; j <= n - 1; j++) {
            if (N2s[j] < N2s[minj]) {
                minj = j;
            }
        }
        int a = N2s[i];
        N2s[i] = N2s[minj];
        N2s[minj] = a;
        
        String b = N1s[i];
        N1s[i] = N1s[minj];
        N1s[minj] = b;
    }
    for (int k = 0; k < n - 1; k++) {
        System.out.print (N1s[k] + N2s[k] + " ");
        }
    System.out.println (N1s[n - 1] + N2s[n - 1]);  
    for (l = 0;l <= n - 1;l++) {
    	if (N1b[l] != N1s[l]) {
    		System.out.println("Not stable");
    		break;
    	} 
    	if (l == n - 1) {
    		System.out.println("Stable");
    	}
    }
}
}
