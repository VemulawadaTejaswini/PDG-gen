import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();
    	int[] A = new int[N];
    	for(int i=0;i<K;i++) {
    		int d = sc.nextInt();
    		for(int j=0;j<d;j++) {
    			int x = sc.nextInt();
    			A[x-1] ++;
    		}
    	}
    	int ans = 0;
    	for(int i=0;i<N;i++) {
    		if(A[i]==0) {
    			ans++;
    		}
    	}
    	System.out.println(ans);
    }
}