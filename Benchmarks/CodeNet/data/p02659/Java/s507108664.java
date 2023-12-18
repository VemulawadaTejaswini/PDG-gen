import java.util.*;
import java.lang.Math.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		long syaink = sc.nextLong();
        double syainj = sc.nextDouble();
        int kirisutego=(int)Math.floor(syainj*100);
      System.out.println((syaink*kirisutego)/100);
}
}