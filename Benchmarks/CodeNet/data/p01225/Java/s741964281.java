import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while(n-- > 0){
			Card[] card = new Card[9];
			int[] num = new int[9];
			for(int i=0;i<9;i++) num[i] = sc.nextInt();
			for(int i=0;i<9;i++) card[i] = new Card(num[i],sc.next());

			boolean[] flg = new boolean[9];

			System.out.println(judge(card,flg,9)?1:0);
		}
	}

	public static boolean judge(Card[] card,boolean[] flg,int rem){
		if(rem == 0) return true;

		for(int i=0;i<7;i++){
			for(int j=i+1;j<8;j++){
				for(int k=j+1;k<9;k++){
					if(!flg[i] && !flg[j] && !flg[k] &&
						 Card.isSet(card[i],card[j],card[k])){
						flg[i] = flg[j] = flg[k] = true;
						if(judge(card,flg,rem-3)) return true;
						flg[i] = flg[j] = flg[k] = false;
					}
				}
			}
		}

		return false;
	}
}

class Card{
	int num;
	String color;

	Card(int num,String color){
		this.num = num;
		this.color = color;
	}

	static boolean isSet(Card a,Card b,Card c){
		return
			a.color.equals(b.color) && a.color.equals(c.color) &&
			(a.num == b.num && a.num == c.num || 
			 a.num == b.num-1 && a.num == c.num-2 ||
			 a.num == c.num-1 && a.num == b.num-2 ||
			 b.num == a.num-1 && b.num == c.num-2 ||
			 b.num == c.num-1 && b.num == a.num-2 ||
			 c.num == a.num-1 && c.num == b.num-2 ||
			 c.num == b.num-1 && c.num == a.num-2
			 );
	}
}