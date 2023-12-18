import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		long a = sc.nextInt();
      long b = sc.nextInt();
      long c = sc.nextInt();
      long d = sc.nextInt();

      long stock;
        stock = a*c;

      if(a*d >= stock){
        stock = a*d;
      }
	if(b*d >= stock){
        stock = b*d;
      }
      if(b*c >= stock){
        stock = b*c;
      }
System.out.println(stock);
	}
}