

import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		//????????£?????????????????????
		Scanner sc = new Scanner(System.in);
		//??£?¨?
		char temp; //char????????????????????´???
		int [] table = new int[26]; //??¢?????????????????????26???????????¨?????????
		//??°?????????
		while(sc.hasNext()){
			//?????????(??±???)?????????
			String line = sc.nextLine();
			//??¨???????????????????°???????????????´
			String lower = line.toLowerCase();
			//?????????????????????
			for(int i =0; i < lower.length(); i++){
				//?°??????????char????????????
				temp = lower.charAt(i);
				//System.out.print(temp+ " ");
				//??¢??????????????????????°???????????????°????????????
				if('a' <= temp  && temp  <= 'z'){
					table[temp - 'a']++;
				}
			}
		}
		//???????????????????????°?????????
		for(int i = 0; i < table.length; i++){
			//?????£??????????????´ a : ??????????????° ??¨???
			System.out.println( (char )('a' + i)+ " : "+ table[i]);
		}
	}
}