import java.util.*;
 
public class Main{
	static Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		// int[] a = new int[n];
		// for(int i = 0; i<n; i++){
		// 	a[i] = in.nextInt();
		// }

		// int min = Integer.MAX_VALUE;
  		// int max = Integer.MIN_VALUE;
 	
	public static void main(String[] args) {
		//zhan
		//dos
		//md
		int test = 1;
		while(test>0){
			solve();
			test--;
		}
	}

	public static void solve(){
		String str = in.next();
		for(char c: str.toCharArray()){
			if(c == 'A') continue;
			if(c == 'C') continue;

			if(Character.isUpperCase(c)){
				System.out.println("WA");
				return;
			}
		}
		if(str.charAt(0) != 'A'){
			System.out.println("WA");
		}else if(str.indexOf("C") == str.lastIndexOf("C") && (str.indexOf("C")>=2 && str.indexOf("C")<=str.length()-2)){
			System.out.println("AC");
		}else{
			System.out.println("WA");
		}
	}
}