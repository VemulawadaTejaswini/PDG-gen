import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public final int SUIT = 4;
	public final int RANK = 13;
	boolean[][] cards = new boolean[SUIT][RANK];
	ArrayList<String> list = new ArrayList<String>();
	
	public void search(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		try {
			while((str=br.readLine())!=null){
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i=1; i<list.size()-1; i++){
			String[] s	= list.get(i).split(" ");
			int suit =0;
			if(s[0].equals("S")) suit = 0;
			if(s[0].equals("H")) suit = 1;
			if(s[0].equals("C")) suit = 2;
			if(s[0].equals("D")) suit = 3;
			int rank	= Integer.parseInt(s[1]);
			cards[suit][rank] = true;
		}
		
		for(int i=0; i<SUIT; i++){
			for(int j=0; j<RANK; j++){
				if(cards[i][j]==false){
					String s = null;
					if(i==0) s="S";
					if(i==1) s="H";
					if(i==2) s="C";
					if(i==3) s="D";
					System.out.println(s + " " + j);
				}
			}
		}
	}
	public static void main(String[] args){
		new Main().search();
	}
}