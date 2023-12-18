import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int n = Integer.parseInt(tmpArray[0]);
			int w = Integer.parseInt(tmpArray[1]);
			int d = Integer.parseInt(tmpArray[2]);
			
			if(n == 0 && w == 0 && d == 0){
				break;
			}
			
			int[][] cut = new int[n][2];
			
			for(int i = 0; i < n; i++){
				tmpArray = br.readLine().split(" ");
				
				cut[i][0] = Integer.parseInt(tmpArray[0]);
				cut[i][1] = Integer.parseInt(tmpArray[1]);
			}
			solve(w, d, cut);
		}
	}
	
	static void solve(int w, int d, int[][] cut){
		ArrayList<Piece> list = new ArrayList<Piece>();
		list.add(new Piece(w, d));
		
		int n = cut.length;
		
		for(int i = 0; i < n; i++){
			Piece[] child = list.get(cut[i][0] - 1).cut(cut[i][1]);
			list.remove(cut[i][0] - 1);
			list.add(child[0]);
			list.add(child[1]);
			
			//debug
//			System.out.println("i = "+i);
//			Iterator<Piece> it = list.iterator();
//			while(it.hasNext()){
//				Piece p = it.next();
//				
//				System.out.print(p.w*p.d);
//				if(it.hasNext()){
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
		}
		
		Collections.sort(list);
		
		//output
		Iterator<Piece> it = list.iterator();
		while(it.hasNext()){
			Piece p = it.next();
			
			System.out.print(p.w*p.d);
			if(it.hasNext()){
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}

class Piece implements Comparable<Piece>{
//	int id;
	int w;
	int d;
	
	public Piece (int w, int d){
//		this.id = id;
		this.w = w;
		this.d = d;
	}

	@Override
	public int compareTo(Piece p) {
		return this.w*this.d - p.w*p.d;
	}
	
	public Piece[] cut(int pos){
		Piece[] child = new Piece[2];
		pos %= 2*(w+d);
		//垂直カット
		if(pos < w || (pos > w + d && pos < w*2 + d)){
			if(pos > w){
				pos -= w + d;
			}
			
			if(pos*d <= (w - pos)*d){
				child[0] = new Piece(pos, d);
				child[1] = new Piece(w - pos, d);
			}
			else {
				child[1] = new Piece(pos, d);
				child[0] = new Piece(w - pos, d);
			}
		}
		//水平カット
		else{
			if(pos > w*2 + d){
				pos -= w + d;
			}
			
			if(w*(pos - w) <= w*(d - pos + w)){
				child[0] = new Piece(w, pos - w);
				child[1] = new Piece(w, d - pos + w);
			}
			else {
				child[1] = new Piece(w, pos - w);
				child[0] = new Piece(w, d - pos + w);
			}
		}
		
		return child;
	}
}

