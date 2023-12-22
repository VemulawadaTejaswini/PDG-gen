import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tmp;
		
		for(int i = 1; i <= n; i++){
			String st = sc.next();
			BigDecimal bd = new BigDecimal(st);
			
			System.out.println("Case "+i+":");
			for(int j = 0; j < 10; j++){
				bd = bd.multiply(bd);
				st = bd.toString();
				if(st.length() < 8){
					tmp = 8 - st.length();
					String s = "";
					for(int k = 0; k < tmp; k++){
						s += "0";
					}
					st = s + st;
				}
				st = st.substring(2, 6);
				bd = new BigDecimal(st);
				System.out.println(bd);
			}
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}