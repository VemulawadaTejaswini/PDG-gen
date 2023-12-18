import java.util.Scanner;
import java.io.*;

public class Main{
	public static int combination(int n){
		return ( n < 10 ) ? n+1 : 19-n;
	}
	
	public static int solve(int x){
		int ans = 0;
		int i = 0;
		for(; i <= 18 && x-i >= 0; i++){
			if( x-i <= 18 ){
				ans += combination(x-i)*combination(i);
			}
		}
		return ans;
	}
		
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		int[] result = new int[100];
		int index = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			int n = 0;
			while( stdIn.hasNext() ){
				if( stdIn.hasNextInt() ){
					n = stdIn.nextInt();
				} else {
					stdIn.next();
				}
				result[index] = solve(n);
				index++;			
			}
			for(int i = 0; i < index; i++){
				System.out.println(result[i]);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}