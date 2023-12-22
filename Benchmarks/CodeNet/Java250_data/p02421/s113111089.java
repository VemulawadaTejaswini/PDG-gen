import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j, k;
    	int tp = 0;
    	int hp = 0;
    	int n = sc.nextInt();
    	
    	for(i = 0; i < n; i++) {
    		String taro = sc.next();
    		String hana = sc.next();
    		
    		if(taro.compareTo(hana) > 0) tp += 3;
    		else if(taro.compareTo(hana) < 0) hp += 3;
    		else {
    			tp++;
    			hp++;
    		}
    	}
    	System.out.println(tp + " " + hp);
    }
}
