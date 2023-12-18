import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		
		Scanner scan = new Scanner(System.in);
		
		
		String S = scan.next();
		
		
		char[] moji = new char[S.length()];
		
		moji = S.toCharArray();
		
		Arrays.sort(moji);
		
		
		int okcount = 1;
		
		
		
		for(int i = 0;i<S.length()-1;i++){
			
			if(moji[i]==moji[i+1]){
				okcount=0;
				break;
			}
			
			
			//System.out.println(moji[i]);
			
		}
		
		
		System.out.println(okcount==1?"yes":"no");
		
		
	
	}

}
