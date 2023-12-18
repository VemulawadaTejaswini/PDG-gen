import java.math.BigDecimal;
import java.math.BigInteger;
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
    long X;
    long K;
    long D;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.X = sc.nextLong();
        this.K = sc.nextLong();
        this.D = sc.nextLong();
    }
    
    //解答処理
    private Long solve() {
        Long answer = 0L;
        long min = Integer.MAX_VALUE;
        
        for (int i=0; i<K; i++) {
        	if (X==D) {
        		min = X;
        		break;
        	}
        	X -= D;
        	BigDecimal Xb = new BigDecimal(BigInteger.valueOf(X));
        	BigDecimal tmp = Xb.abs(); 
        	min = (long)Math.min(tmp.longValue(), min);
        	if (min == (X+D)/2) {
        		break;
        	}
        }
        
        answer = min;
        return answer;
    }
    
    //出力
    public void show(Long answer) {
        System.out.println(answer);
    }

}
