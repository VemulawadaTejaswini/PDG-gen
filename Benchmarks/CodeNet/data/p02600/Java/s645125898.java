//クラス名は必ずMainにする必要があります。

import java.util.*;

public class Main {
  	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		
		if(400 <=n && n < 600){
			System.out.println("8");
		}else if(600 <=n && n < 800){
			System.out.println("7");
		}else if(800 <=n && n < 1000){
			System.out.println("6");
		}else if(1000 <=n && n < 1200){
			System.out.println("5");
		}else if(1200 <=n && n < 1400){
			System.out.println("4");
		}else if(1400 <=n && n < 1600){
			System.out.println("3");
		}else if(1600 <=n && n < 1800){
			System.out.println("2");
		}else if(1800 <=n && n < 2000){
			System.out.println("1");
		}
		 
		
	}
	
}
