import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int M = sc.nextInt();
    	int[] a = new int[A];
    	int[] b = new int[B];
    	int aMin = 100001;
    	int bMin = 100001;
    	for(int i = 0; i < A; i++){
    	    a[i] = sc.nextInt();
    	    aMin = Math.min(aMin, a[i]);
    	}
    	for(int i = 0; i < B; i++){
    	    b[i] = sc.nextInt();
    	    bMin = Math.min(bMin, b[i]);
    	}
    	int ans = aMin + bMin;
    	for(int i = 0; i < M; i++){
			int t1 = sc.nextInt()-1;
			int t2 = sc.nextInt()-1;
			int t3 = sc.nextInt();
			int sum = a[t1] + b[t2] - t3;
			ans = Math.min(sum, ans);
    	}
    	sc.close();
    	System.out.println(ans);
    }
}