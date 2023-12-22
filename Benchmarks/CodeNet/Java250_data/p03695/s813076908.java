import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.solve();
        m.show();
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    int N;
    int[] a;
    int max;
    int min;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.N = sc.nextInt();
        a = new int[N];
        for (int i=0; i<N; i++) {
        	a[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private void solve() {
    	HashMap<String,Integer> map = new HashMap<String,Integer>();
    	for (int i=0; i<N; i++) {
    		int count = 1;
    		String tmp = color(a[i]);
    		if (map.containsKey(tmp)) {
    			count += map.get(tmp);
    		}
    		map.put(tmp, count);
    	}
    	
    	if (!map.containsKey("colorless")) {
    		min = map.size();
    		max = map.size();
    	} else {
    		min = map.size()-1;
    		max = min + map.get("colorless");
    		if (map.size() == 1) { //全員が3200以上の場合
    			min = map.size();
    		}
    		
    	}
    }
    
    //a[i]のレートの色を判別するメソッド
    private String color(int a) {
    	String color = "colorless";
    	if (1<=a && a<400) {
    		color = "gray";
    	} else if (400<=a && a<800) {
    		color = "brown";
    	} else if (800<= a && a<1200) {
    		color ="green";
    	} else if (1200<=a && a<1600) {
    		color = "ligthBlue";
    	} else if (1600<=a && a<2000) {
    		color = "blue";
    	} else if (2000<=a && a<2400) {
    		color = "yellow";
    	} else if (2400<=a && a<2800) {
    		color = "orange";
    	} else if (2800<=a && a<3200) {
    		color = "red";
    	}
    	
    	return color;
    }
    
    //出力
    public void show() {
        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
    }

}
