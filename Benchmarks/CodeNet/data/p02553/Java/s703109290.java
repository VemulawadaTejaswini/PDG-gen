import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    long a;
    long b;
    long c;
    long d;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.a = sc.nextLong();
        this.b = sc.nextLong();
        this.c = sc.nextLong();
        this.d = sc.nextLong();
    }
    
    //解答処理
    private long solve() {
        long answer = Long.MIN_VALUE;
        
        for (long i=a; i<=b; i++) {
        	long x = i;
        	for (long j=c; j<=d; j++) {
        		long y = j;
        		long tmp = x * y;
        		answer = Math.max(answer, tmp);
        	}
        }
        
        return answer;
    }
    
    //出力
    public void show(long answer) {
        System.out.println(answer);
    }

}
