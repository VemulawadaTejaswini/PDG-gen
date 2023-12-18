import java.math.BigDecimal;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String b = sc.nextLine();
        
        String[] numbers = b.split(" ");
        Arrays.sort(numbers, Comparator.reverseOrder());
        BigDecimal ans = BigDecimal.valueOf(1);
        BigDecimal limit = BigDecimal.valueOf(Math.pow(10, 18));
        boolean flg = true;
        for(int i = 0; i < a; i++) {
        	if(Arrays.asList(numbers).contains("0")) {
        		ans = BigDecimal.valueOf(0);
        		break;
        	}
        	ans = ans.multiply(BigDecimal.valueOf(Double.parseDouble(numbers[i])));
        	if(ans.compareTo(limit) == 1) {
        		flg = false;
        		break;
        	}
        }
        if(flg) {
        	System.out.println(ans.toPlainString());
        } else {
        	System.out.println(-1);
        }
        
        sc.close();
	}

}
