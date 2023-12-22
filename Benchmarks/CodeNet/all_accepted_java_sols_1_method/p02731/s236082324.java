import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int L = sc.nextInt();
    	sc.close();
    	BigDecimal bd = BigDecimal.valueOf(L);
    	BigDecimal three = BigDecimal.valueOf(3);;
    	BigDecimal ans = bd.divide(three, 7, RoundingMode.HALF_UP);
    	System.out.println(ans.pow(3));
    }

}