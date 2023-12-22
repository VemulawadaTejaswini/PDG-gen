import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int d = sc.nextInt();
		int range = 2*d + 1;
		int amari=0;
		if(n%range !=0){
			amari = 1;
		}


			System.out.println(n/range + amari);

	}



}
