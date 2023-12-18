import java.util.*;
import java.math.*;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int r = scanner.nextInt();
	BigDecimal circArea = new BigDecimal(r*r*Math.PI);
	circArea.scale=5;
	BigDecimal circFere = new BigDecimal(2*r*Math.PI);
	circFere.scale=5;
	System.out.println(circArea.toPlainString()+" "+circFere.toPlainString());
  }
}
	