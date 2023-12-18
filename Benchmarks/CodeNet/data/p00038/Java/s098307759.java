//Volume0-0038
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Num {
	public int num = 1;
}

public class Main {

    //declare
	private static ArrayList<Integer>   ar   = new ArrayList<Integer>(),
	                                    list = new ArrayList<Integer>();
	private static HashMap<Integer,Num> map  = new HashMap<Integer,Num>();

	public static void main(String[] args){

		String   result;
		String[] s;
		int      card;

		//initialize
		init();

        //input
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	ar.clear();
        	map.clear();
        	s = sc.nextLine().split(",");
        	for(int i=0;i<5;i++){
        		card = Integer.parseInt(s[i]);
        		ar.add(card);
        		if(map.containsKey(card)){
        			map.get(card).num++;
        		} else {
        			map.put(card, new Num());
        		}
        	}

        	//calculate
        	Collections.sort(ar);

        	out:{
        		if(include(4))  {result = "four card" ; break out;}
        		if(include(2,3)){result = "full house"; break out;}
        		if(straight())  {result = "straight"  ; break out;}
        		if(include(3))  {result = "three card"; break out;}
        		if(include(2,2)){result = "two pair"  ; break out;}
        		if(include(2))  {result = "one pair"  ; break out;}
                                 result = "null"      ;
        	}

        	//output
        	System.out.println(result);
        }
	}

	private static void init(){
		for(int i=1;i<15;i++){
			list.add(i);
		}
	}

	private static boolean include(int i){
		boolean ret = false;
		Collection<Num> cl = map.values();
		for(Num n:cl){
			if(n.num == i){
				ret = true;
			}
		}
		return ret;
	}

	private static boolean include(int i,int j){

		boolean ret = false;

		if(i != j){
			if(include(i) && include(j)){ret = true;}
		} else {
			int cnt = 0;
			Collection<Num> cl = map.values();
			for(Num n:cl){
				if(n.num == i){
					cnt++;
				}
			}
			if(cnt > 1){ret = true;}
		}
		return ret;
	}

	private static boolean straight(){
		boolean ret   = false;
		int     match = 0;
		for(int i=list.indexOf(ar.get(0)),j=0; i<list.size() && j<ar.size();i++,j++){
			if   (list.get(i) == ar.get(j)){match++;}
			else                           {break;}
		}
		if     (match == 5){ret = true;}
		else if(ar.contains(1)){
			ar.remove(0);
			ar.add(14);
			ret = straight();}
		return ret;
	}
}