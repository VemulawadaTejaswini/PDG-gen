import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main{


	public static void main(String[] args) {
		new Main().run();
	}

	void run(){
		char[] wormcolor;
		Scanner sc = new Scanner(System.in);
		while(true){
			wormcolor = sc.next().toCharArray();
			if(wormcolor.equals("0")){
				break;
			}			
			System.out.println(BFS(wormcolor));
		}
	}

	String BFS(char[] wc){
		HashSet<String> used = new HashSet<String>();
		Queue<Worm> q = new LinkedList<Worm>();
		Worm wm = new Worm(wc, 0);
		q.add(wm);
		while(!q.isEmpty()){
			Worm cur = q.poll();
			if(cur.isSameColor()){
				return cur.getDepth()+"";
			}
			if(used.contains(String.valueOf(cur.getColor()))){
				//System.out.println("here");
				continue;
			}
			/*
			System.out.println(cur.depth + ":");
			for(String c: used){
				System.out.println(c);
			}
			*/
			used.add(String.valueOf(cur.getColor()));
			for(Worm nw: cur.getNext()){
				q.add(nw);
			}
		}
		return "NA";
	}
}

class Worm{
	char[] color;
	int depth;
	HashMap<String,Character> table = new HashMap<String,Character>(); 
	public Worm(char[] color, int depth){
		this.color = color;
		this.depth = depth;
		table.put("rg",'b'); table.put("gr",'b');
		table.put("rb",'g'); table.put("br",'g');
		table.put("gb",'r'); table.put("bg",'r');
	}

	boolean isSameColor(){
		for(int i=0; i < color.length - 1; i++){
			if(color[i] != color[i+1]){
				return false;
			}
		}
		return true;
	}

	public int getDepth(){
		return depth;
	}

	public char[] getColor() {
		return color;
	}

	public ArrayList<Worm> getNext(){
		ArrayList<Worm> result = new ArrayList<Worm>();
		for(int i = 0; i < color.length - 1; i++){
			if(color[i] == color[i+1]){
				continue;
			}
			char[] cp = Arrays.copyOf(color, color.length);
			cp[i] = table.get(String.valueOf(color[i]) + color[i+1]);
			cp[i+1] = table.get("" + color[i] + color[i+1]);
			result.add(new Worm(cp, depth+1));
		}
		return result;
	}
}