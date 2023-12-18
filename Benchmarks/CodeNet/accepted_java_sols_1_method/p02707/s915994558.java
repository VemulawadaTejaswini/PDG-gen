import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();

    	int[] member = new int[N];


    	for(int i=0;i<N;i++) {
    		member[i] = 0;
    	}

    	for(int i=0;i<N-1;i++) {
    		int joshiNumber = sc.nextInt();
    		member[joshiNumber-1] = member[joshiNumber-1] + 1;
    	}
    	for(int i=0;i<N;i++) {
    		System.out.println(member[i]);
    	}

    }
}