//Volume0-0099
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Player implements Comparable<Player> {
	public int a;
	public int v;
	Player(int a,int v){
		this.a = a;
		this.v = v;
	}
	public int compareTo(Player p){
		int ret;
		if(p.v != this.v){
			ret = p.v - this.v;
		} else {
			ret = this.a - p.a;
		}
		return ret;
	}
	public boolean equals(Object obj){
		Player p = (Player)obj;
		boolean ret = false;
		if(this.a == p.a){
			ret = true;
		}
		return ret;
	}
}

public class Main {

	private static  ArrayList<Player> ar = new ArrayList<Player>();

	public static void main(String[] args){

		//declare
		int q,idx;
		Player p,Champion;

		//input
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        q = sc.nextInt();
        while(q-- > 0){
        	p = new Player(sc.nextInt(),sc.nextInt());
        	if((idx = ar.indexOf(p)) != -1){
        		ar.get(idx).v += p.v;
        	} else {
        		ar.add(p);
        	}
            //calculate
        	Collections.sort(ar);
        	Champion = ar.get(0);

        	//output
        	System.out.println(Champion.a + " " + Champion.v);
        }
	}
}