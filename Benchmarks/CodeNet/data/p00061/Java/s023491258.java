//Volume0-0061
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Tm implements Comparable<Tm>{
	public final int team;
	public final int crct;
	Tm(int t,int c){
		this.team = t;
		this.crct = c;
	}

	public int compareTo(Tm t){
		return t.crct - this.crct;
	}
}

public class Main {

	public static void main(String[] args) {

		//declare
		ArrayList<Tm> tm = new ArrayList<Tm>();
		Tm T;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		String[] s;
		int t,c,rank,pre;

        //input
        Scanner sc = new Scanner(System.in);
        while(true){
        	s = sc.nextLine().split(",");
        	t = Integer.parseInt(s[0]);
        	c = Integer.parseInt(s[1]);
        	if(t == 0 && c == 0){break;}
        	tm.add(new Tm(t,c));
        }

    	//calculate
        Collections.sort(tm);

    	pre  = -1;
    	rank =  0;
        for(int i=0;i<tm.size();i++){
        	T = tm.get(i);
        	if(T.crct == pre){
        		map.put(T.team,rank);
        	} else {
        		rank++;
        		map.put(T.team,rank);
        		pre  = T.crct;
        	}
        }

    	//output
        while(sc.hasNext()){
        	System.out.println(map.get(sc.nextInt()));
        }
	}
}