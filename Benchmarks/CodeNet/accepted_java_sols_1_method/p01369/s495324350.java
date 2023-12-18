/*
  テヲツ鳴?・ツュツ療」ツ?ョテ・ツ閉湘ゥツ。ツ古」ツ??
  テ・ツ渉ウテヲツ可凝」ツつソテ」ツつ、テ」ツδ療」ツ?凝・ツキツヲテヲツ可凝」ツつソテ」ツつ、テ」ツδ療」ツ?ョテ」ツ?ゥテ」ツ?。テ」ツつ嘉」ツ?凝」ツ?ョテヲツ鳴?・ツュツ療」ツつ津ゥツ?催・ツ按療」ツ?ィテ」ツ?療」ツ?ヲテァツ板ィテヲツ?湘」ツ?療」ツ??ァツ崢エテ・ツ可催」ツ?ョテヲツ可凝」ツ?ィテヲツャツ。テ」ツ?ョテヲツ可凝」ツつ津ヲツッツ氾ィツシツε」ツ??
 */

import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args) {
	char[] right = {'y', 'u', 'i','o', 'p', 'h', 'j', 'k', 'l', 'n', 'm'};

	while(kbd.hasNext()){
	    String word = kbd.next();
	    if(!word.equals("#")){
		String hand = "";
		int p = 0;
		int count = 0;
		char c = word.charAt(p);

		for(p=0; p<word.length(); p++){
		    int a=0;
		    c = word.charAt(p);
		    while(a<right.length && c!=right[a]) a++;

		    //テヲツャツ。テ」ツ?ョテ・ツ?・テ・ツ環崚」ツ?古・ツ渉ウテヲツ可凝」ツ??」ツ?」テ」ツ??
		    if(a<right.length && c == right[a]){
			//テァツ崢エテ・ツ可催」ツ?ョテヲツ可凝」ツ?ッ...
			if(hand.equals("l")) { hand="r"; count++; }
			else hand = "r";
		    }
		    //テヲツャツ。テ」ツ?ョテ・ツ?・テ・ツ環崚」ツ?古・ツキツヲテヲツ可凝」ツ??」ツ?」テ」ツ??
		    else {
			//テァツ崢エテ・ツ可催」ツ?ョテヲツ可凝」ツ?ッ...
			if(hand.equals("r")) { hand="l"; count++; }
			else hand = "l";
		    }

		}

		System.out.println(count);
	    }
	}
    }
}