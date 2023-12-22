import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++){
			if ((i % 3 == 0) || (i % 10 == 3) || include3(i / 10)){
					System.out.print(" "+ i);
			}
		}
		System.out.println("");
	}
	
	public static boolean include3(int num){
		boolean flg = false;
		String s = Integer.toString(num);
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) == '3'){
				flg = true;
			}
		}
		return flg;
	}
}