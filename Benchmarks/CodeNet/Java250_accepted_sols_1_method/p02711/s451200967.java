import java.util.*;
public class Main{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		int N = ob.nextInt();
		int count = 0;
		int num;
		/*String con;

		con = Integer.toString(N);

		for(int i = 0; i < con.length(); i++){
			if(con.charAt(i) == 7){
				++count;
			}
		}
		if(count > 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}*/

		for(int i = 1; i <= N; i++ ){
			num = N % 10;
			if(num == 7){
				++count;
			}

			N /= 10;
		}
		if(count > 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
