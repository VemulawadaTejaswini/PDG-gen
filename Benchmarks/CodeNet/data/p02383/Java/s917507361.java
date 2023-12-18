import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//PrintWriter out=new PrintWriter(System.out);
		Dice D=new Dice();
		List<Integer> dice=new ArrayList<>();
		for(int i=0;i<6;i++)dice.add(in.nextInt());
		char odrs[]=in.next().toCharArray();
		for(int i=0;i<odrs.length;i++)D.turn(odrs[i]);
		System.out.println(dice.get(D.side.get(0)-1));
		//out.flush();
	}
}

class Dice{
	static List<Integer> side=new ArrayList<>(Arrays.asList(1,3,6,4)),vert=new ArrayList<>(Arrays.asList(1,5,6,2));
	
	static void turn(char dist) {
		switch(dist) {
		case 'N':
			int topn=vert.remove(3);
			vert.add(0, topn);
			side.set(0, vert.get(0)); side.set(2, vert.get(2));
			//System.out.println(side+" "+vert);
			break;
			
		case 'E':
			int tope=side.remove(3);
			side.add(0, tope);
			vert.set(0, side.get(0)); vert.set(2, side.get(2));
			//System.out.println(side+" "+vert);
			break;
		
		case 'S':
			int tops=vert.remove(0);
			vert.add(tops);
			side.set(0, vert.get(0)); side.set(2, vert.get(2));
			//System.out.println(side+" "+vert);
			break;
			
		case 'W':
			int topw=side.remove(0);
			side.add(topw);
			vert.set(0, side.get(0)); vert.set(2, side.get(2));
			//System.out.println(side+" "+vert);
			break;
		}	
	}
}

