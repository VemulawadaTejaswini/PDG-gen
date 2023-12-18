import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Pair{
	int mult = 1;
	int min = 10;
	int rangeMin;
	int rangeMax;
	
	public Pair(int rangeMin, int rageMax) {
		this.rangeMax = rageMax;
		this.rangeMin = rangeMin;
	}
	
	boolean isInRange(int x){
		return x >= rangeMin && x <= rangeMax;
	}
	
	void multi(int x){
		mult *= x;
		if(x < min) min = x;
	}
	
	void set(){
		mult /= min;
	}
	@Override
	public String toString() {
		return mult+" min"+min;
	}
}

class Card implements Comparable<Card>{
	int value;
	int pos;
	public Card(int v, int p) {
		value = v;
		pos = p;
	}
	@Override
	public String toString() {
		return "pos"+pos;
	}
	
	@Override
	public int compareTo(Card o) {
		return o.value - value;
	}
}

public class Main {
	public static void main(String[] args){
		Scanner sn =new Scanner(System.in);
		while(true){
			int n = sn.nextInt(), k = sn.nextInt();
			if(n+k == 0) break;
			Card[] cards = new Card[n];
			ArrayList<Pair> pairs = new ArrayList<Pair>();
			for(int i = 0; i < n; i++){
				cards[i] = new Card(sn.nextInt(), i);
			}
			int end = k-1;
			for(int i = 0; end < n; i++){
				Pair pair = new Pair(i, end);
				for(int j = i; j <= end; j++){
					pair.multi(cards[j].value);
				}
				pair.set();
				pairs.add(pair);
				end++;
			}
			
			int maxPair = 0;
			for(int i = 0; i < pairs.size(); i++){
				Pair p = pairs.get(i);
				int newMax = p.mult*p.min;
				if(maxPair < newMax) maxPair = newMax;
			}
			Arrays.sort(cards);
	
			int maxMulti = 0;
			for(int i = 0; i < pairs.size(); i++){
				Pair newP = pairs.get(i);
				int j;
				for(j = 0; newP.isInRange(cards[j].pos); j++);
				
				int newMulti = newP.mult *cards[j].value;
				if(newMulti > maxMulti) maxMulti = newMulti;
			}
			int diff = maxPair - maxMulti;
			if(diff < 0){
				System.out.println("NO GAME");
			} else {
				System.out.println(diff);
			}
		}
	}
}