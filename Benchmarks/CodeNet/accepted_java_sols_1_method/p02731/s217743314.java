import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Main{
	public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int l = scn.nextInt();
      double third = (double)l/3;
      BigDecimal bd = new BigDecimal(third*third*third);
      System.out.println(bd.setScale(12, RoundingMode.HALF_UP));
	}
}