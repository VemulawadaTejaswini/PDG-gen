import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String W = scan.next();
		int cnt = 0;
		for(;;){
			String T = scan.next();
			if(T.equals("END_OF_TEXT")){
				break;
			} else{
				String TT = T.toLowerCase();
				String WW = W.toLowerCase();
				if(TT.equals(WW)){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}