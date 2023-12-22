import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S  = keyboard.next();
		
		S = S.replace('A', '#');
		S = S.replace('T', '#');
		S = S.replace('G', '#');
		S = S.replace('C', '#');
		S = S + "?"; 
		String[] Y = S.split("");
		
		int count = 0;
		int ans = 0;
		
		for(int i = 0; i<S.length(); i++){
			if(Y[i].equals("#")){
				count++;
			}else{
				ans = (count > ans) ? count : ans;
				count = 0;
					}
			}

		System.out.println(ans);
		keyboard.close();	
	}
}