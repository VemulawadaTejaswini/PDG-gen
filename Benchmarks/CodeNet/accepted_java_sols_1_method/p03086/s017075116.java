import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S  = keyboard.next();
		
		String X1 = S.replace('A', '#');
		String X2 = X1.replace('T', '#');
		String X3 = X2.replace('G', '#');
		String X4 = X3.replace('C', '#');
		X4 = X4 + "?"; 
		String[] Y = X4.split("");
		
		int count = 0;
		int ans = 0;
		
		for(int i = 0; i<X4.length(); i++){
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