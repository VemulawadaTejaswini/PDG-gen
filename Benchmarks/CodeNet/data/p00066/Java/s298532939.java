import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

enum result{
	o, x, d
}

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> games = new ArrayList<String>();
		while(sc.hasNextLine()) games.add(sc.nextLine());
		
		Iterator<String> it = games.iterator();
		while(it.hasNext()) {
			result gameresult = judge(it.next());
			System.out.println(gameresult.toString());
		}

	}

	
	static result judge(String game) {
		//テァツオツ静ヲツ楪徙テ」ツ?古・ツ仰敕」ツ?。テ」ツ?ェテ」ツつ?, xテ」ツ?古・ツ仰敕」ツ?。テ」ツ?ェテ」ツつ?, テ・ツシツ陛」ツ?催・ツ按?」ツ?妥」ツ?ェテ」ツつ?
		//テ」ツつイテ」ツδシテ」ツδ?、ツセツ黍oosxssxs
		
		char[][] gameboard = new char[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				gameboard[i][j] = game.charAt(i*3 + j);
			}
		}
		
		//gameboardテ」ツ?古・ツョツ古ヲツ按静」ツ?療」ツ?淌」ツつ嘉ァツクツヲテ」ツ??ヲツィツェテ」ツ??ヲツ鳴愿」ツつ?」ツつ津ィツェツソテ」ツ?ケテ」ツつ?
		
		//テヲツィツェ
		for(int i = 0; i < 3; i++) {
			char firstmark = gameboard[i][0];
			if(gameboard[i][1] == firstmark && gameboard[i][2] == firstmark) {
				if(firstmark == 'o') return result.o;
				else if(firstmark == 'x') return result.x;
			}
		}
		
		//テァツクツヲ
		for(int j = 0; j < 3; j++) {
			char firstmark = gameboard[0][j];
			if(gameboard[1][j] == firstmark && gameboard[2][j] == firstmark) {
				if(firstmark == 'o') return result.o;
				else if(firstmark == 'x') return result.x;
			}
		}
		
		//テヲツ鳴愿」ツつ?(テ・ツキツヲテ、ツクツ甘」ツ?凝」ツつ嘉・ツ渉ウテ、ツクツ?
		{
			char firstmark = gameboard[0][0];
			if(gameboard[1][1] == firstmark && gameboard[2][2] == firstmark) {
				if(firstmark == 'o') return result.o;
				else if(firstmark == 'x') return result.x;
			}
		}
		
		
		//テヲツ鳴愿」ツつ?(テ・ツ渉ウテ、ツクツ甘」ツ?凝」ツつ嘉・ツキツヲテ、ツクツ?
		{
			{
				char firstmark = gameboard[2][0];
				if(gameboard[1][1] == firstmark && gameboard[0][2] == firstmark) {
					if(firstmark == 'o') return result.o;
					else if(firstmark == 'x') return result.x;
				}
			}
			
		}
		
		//テ」ツ?ゥテ」ツつ古」ツ?ォテ」ツつづィツゥツイテ・ツスツ禿」ツ?療」ツ?ェテ」ツ?妥」ツつ古」ツ?ーテ・ツシツ陛」ツ?催・ツ按?」ツ??
		return result.d;
	}
}