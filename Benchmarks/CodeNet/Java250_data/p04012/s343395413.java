import java.util.HashMap;
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
    String w;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.w = sc.next();
    }
    
    //解答処理
    private String solve() {
        String answer = "No";
        if (w.length() % 2 == 0) {
        	if (beautiful(w)) {
        		answer = "Yes";
        	}
        }
        
        return answer;
    }
    
    //美しい文字列か判定するメソッド
    private boolean beautiful(String w) {
    	boolean judge = true;
    	
    	//HashMapに単語とその登場回数を格納
    	HashMap<String,Integer> map = new HashMap<String,Integer>();
    	map.put(String.valueOf(w.charAt(0)), 1);
    	for (int i=1; i<w.length(); i++) {
    		int count = 1;
    		if (map.containsKey(String.valueOf(w.charAt(i)))) {
    			count += map.get(String.valueOf(w.charAt(i)));
    		}
    		map.put(String.valueOf(w.charAt(i)), count);
    	}
    	
    	//各文字の登場回数が偶数個か判定
    	for (int tmp : map.values()) {
    		if (tmp % 2 != 0) {
    			judge = false;
    			break;
    		}
    	}
    	
    	return judge;
    }
    
    //出力
    public void show(String answer) {
        System.out.println(answer);
    }

}
