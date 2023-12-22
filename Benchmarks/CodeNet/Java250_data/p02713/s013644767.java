import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long sum = 0;
		int gcd = 1;
	    for(int i = 1; i <= num; i++){
	    	for(int j = 1; j <= num; j++){
	    		for(int k = 1; k <= num; k++){
	    	    	if(i == 1 || j == 1 || k == 1) {
	    	    		sum += 1;
	    	    		continue;
	    	    	}else {
	    	    		sum += gcd(gcd(i,j),k);
	    	    	}
	    	    }
		    }
	    }
	    System.out.println(sum);
	}

	public static int gcd(int m, int n) {
        int r;
        while (n > 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}
