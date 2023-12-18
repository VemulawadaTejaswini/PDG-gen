import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());

		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		int INF = Integer.MAX_VALUE;
		int INF_MIN = -1000;//Integer.MIN_VALUE;
		
		boolean flag = true;
		if(c[0] == c[1] || c[1] == c[2] || c[2] == c[3]){
			flag = false;
		}

		if(flag){
			System.out.println("Good");
		}else{
			System.out.println("Bad");
		}
		
	
		
		
	}
}

