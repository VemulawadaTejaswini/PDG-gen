    import java.math.BigDecimal;
    import java.math.RoundingMode;
    import java.util.Scanner;
     
    public class Main {
     
    	public static void main(String[] args) {
    		// TODO 自動生成されたメソッド・スタブ
     
    		Scanner scan = new Scanner(System.in);
    		
    		//BigDecialでdoubleから生成すると誤差が出るのでNG
    		//使うときは".valueOf()"を使う
    		String a = scan.next();
    		String b = scan.next();
    		
    		BigDecimal a1 = new BigDecimal(a);
    		BigDecimal b1 = new BigDecimal(b);
    		
    		BigDecimal answer = a1.multiply(b1);
    		
    		//小数点以下切り捨て
    		answer = answer.setScale(0, RoundingMode.DOWN);	
    		
    		
    		System.out.println(answer);
    		
    		}
     
    }