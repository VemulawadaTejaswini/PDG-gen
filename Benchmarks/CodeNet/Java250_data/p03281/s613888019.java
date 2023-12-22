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
    int N;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
    }
    
    //解答処理
    private int solve() {
    	int answer = 0;
        int count = 0;
        
        for (int i=1; i<=N; i+=2) {
        	count = divisorCount(i);
        	if (count == 8) {
        		answer++;
        	}
        }
        
        return answer;
    }
    
    //約数の個数を返すメソッド
    private int divisorCount(int num) {
    	int count = 0;
    	
    	for (int i=1; i<=num; i++) {
    		if (num % i == 0) {
    			count++;
    		}
    	}
    	
    	return count;
    	
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
