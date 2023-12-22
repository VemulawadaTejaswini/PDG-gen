import java.math.BigInteger;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		BigInteger a = sc.nextBigInteger();
      	BigInteger b = sc.nextBigInteger();
      	if(a.compareTo(b)> 0){
          System.out.println("GREATER");
        }if(a.compareTo(b)< 0){
          System.out.println("LESS");
        }if(a.compareTo(b)== 0){
          System.out.println("EQUAL");
        }
     }
}