// A - Weather Prediction

import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();


		String[] ch = S.split("");
		for(int i=0;i < ch.length;i++){
			boolean isEven = i%2 == 0;
			String s = ch[i];
			if(isEven && (s.equals("R") || s.equals("U") || s.equals("D"))){
				
			}else if(!isEven && (s.equals("L") || s.equals("U") || s.equals("D"))){
				
			}else{
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		
	}
}