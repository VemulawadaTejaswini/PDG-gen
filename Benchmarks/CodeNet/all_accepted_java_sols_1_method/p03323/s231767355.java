	import java.util.*;
	public class Main { 
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			String ans = ":(";
            if(Math.abs(a - b) <= 1){
                ans = "Yay!";
            }
			System.out.println(ans);
	     }
	}