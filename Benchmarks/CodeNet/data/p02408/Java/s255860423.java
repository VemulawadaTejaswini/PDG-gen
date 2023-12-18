import java.util.*;
import java.io.*;

class Card{
 char mark;
 int num;
 boolean have = false;
 static List<Card> allCards = new ArrayList<Card>();

 Card(char mark, int num){
	this.mark = mark;
	this.num = num;
	
}
}

public class Main{
public static void main(String[] args){
try{
 char[] marks ={'S','H','C','D'};
 
	for(char mark: marks){
		for(int i = 0; i < 12; i++){
		 Card.allCards.add(new Card(mark, i+1));
		}
	}

	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 int n = Integer.parseInt(br.readLine());
	 	while(true){
	  	 String[] str = br.readLine().split(" ");
		 	for(Card c : Card.allCards){
				if(c.mark != str[0].charAt(0)){
					continue;
				}
				if(c.num == Integer.parseInt(str[1])){
					c.have = true;
				}
			}
		}
	

	for(Card c : Card.allCards){
		if(c.have == false){
		 System.out.println(c.mark + " " + c.num);
		}
	}
}catch(IOException e){
	 System.out.println(e);
	}}
}