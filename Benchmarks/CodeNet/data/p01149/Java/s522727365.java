import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    int deal, ace; // ace = 1のカードで11カウントしている枚数
    int use;
    String[] c;
    boolean hit;

    void run(){
	n = sc.nextInt();
	while(n>0){
	    n--;
	    ace = 0;
	    deal = 0;
	    get(sc.next());
	    get(sc.next());
	    c = new String[8];
	    for(int i=0; i<c.length; i++)
		c[i] = sc.next();
	    hit = check();
	    // System.out.println("**"+hit+" "+deal);
	    use = 2;

	    int k=0;
	    while(hit && k<c.length){
		get(c[k]);
		use++;
		k++;
		hit = check();
	    }

	    System.out.println
		(use==2&&deal==21 ? "blackjack":deal>21 ? "bust":deal);
	}
    }

    boolean check(){
	if(deal<=16) return true;
	else if(deal==17 && ace>0){
	    ace--;
	    deal -= 10;
	    return true;
	}
	return false;
    }

    void get(String k){
	if(k.equals("A")){
	    if(deal < 11){
		ace++;
		deal += 11;
	    }
	    else deal += 1;
	}
	else if(k.equals("K")||k.equals("Q")||k.equals("J")||k.equals("T"))
	    deal += 10;

	else deal += Integer.parseInt(k);

	while(ace>0 && deal>21){
	    ace--;
	    deal -= 10;
	}
    }
}