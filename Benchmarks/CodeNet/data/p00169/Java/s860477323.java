import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int[] cards;
    int score;
    String s;
    int one;

    void run(){
	while(sc.hasNext()){
	    score = 0;
	    one = 0;
	    s = sc.nextLine();
	    if(s.equals("0")) break;
	    String[] ss = s.split(" ");
	    cards = new int[ss.length];
	    for(int i=0; i<cards.length; i++)
		cards[i] = Integer.parseInt(ss[i]);

	    Arrays.sort(cards);
	    //System.out.println(cards[0]);
	    

	    for(int k=0; k<cards.length; k++)
		if(cards[k]==1){
		    score += 11;
		    one++;
		}
		else if(cards[k]>=10) score += 10;
		else score += cards[k];	    

	    while(one>0 && score>21){
		score -= 10;
		one--;
	    }
	    
	    System.out.println(score<=21 ? score:0);
	}
    }
}