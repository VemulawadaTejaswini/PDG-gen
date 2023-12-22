import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int totalLength = Integer.parseInt(sc.next());
      	double length=(double)totalLength/3;
    	System.out.println(BigDecimal.valueOf(Math.pow(length,3d)).toPlainString());
    }

}