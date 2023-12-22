import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();

    	int s = 0;

    	for(int i=0;i<M;i++) {
    		s = s + sc.nextInt();
    	}

    	if(N>=s) {
    		System.out.println(N-s);
    	} else {
    		System.out.println(-1);
    	}
    }
}