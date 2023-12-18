import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    int deal, ace;
    String[] c;
    boolean hit;

    void run(){
	n = sc.nextInt();
	while(n>0){
	    n--;
	    ace = 0;
	    deal = get(sc.next()) + get(sc.next());
	    c = new String[8];
	    for(int i=0; i<c.length; i++)
		c[i] = sc.next();
	    hit = check();

	    int k=0;
	    while(hit && k<c.length){
		deal += get(c[k]);
		k++;
		hit = check();
	    }

	    System.out.println
		(deal==21&&ace==1 ? "blackjack":deal>21 ? "bust":deal);
	}
    }

    boolean check(){
	while(ace>0 && deal>21){
	    ace--;
	    deal -= 10;
	}
	if(deal<=16) return true;
	else if(deal==17 && ace>0){
	    ace--;
	    deal -= 10;
	    return true;
	}
	return false;
    }

    int get(String k){
	if(k.equals("A")){
	    ace++;
	    return 11;
	}
	else if(k.equals("K")||k.equals("Q")||k.equals("J")||k.equals("T"))
	    return 10;

	else return Integer.parseInt(k);
    }
}