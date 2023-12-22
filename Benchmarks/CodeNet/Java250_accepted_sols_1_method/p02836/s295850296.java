import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		int lm = 0;
		if(n % 2 == 0){
			lm = n/2;
		}else{
			lm = n/2;
		}
		//System.out.println(lm);
		int i = 0, j = n - 1;
		int count = 0;
		while(i < lm ){
			//System.out.println(s.charAt(i));
			if(s.charAt(i) != s.charAt(j)){
				count++;
			}
			i++;
			j--;
		}
		System.out.println(count);
		
	}
		
		
}