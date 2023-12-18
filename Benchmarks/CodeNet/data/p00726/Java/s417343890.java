import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	String str;
	int pos;
	char [] data;
	int ind;
	int ansindex;
	boolean flg;
	
	private String exp(){
		if(flg) return "";
		StringBuilder res = new StringBuilder(term());
		if(flg) return "";
		char word = str.charAt(pos);
		while(!(word == ')' || word == '#' || word == '(')){
			res.append(term());
			if(flg) break;
			word = str.charAt(pos);
		}
		if(flg) return "";
		return res.toString();
	}
	
	private String term(){
		if(flg) return "";
		String res = fact();
		if(flg) return "";
		char input = res.charAt(0);
		if(Character.isDigit(input)){
			int times = Integer.parseInt(res);
			String word = fact();
			if(flg) return "";
			StringBuilder res2 = new StringBuilder(word);
			for(int i=1; i < times; i++){
				res2.append(word);
				for(int j=0; j < word.length();j++){
					data[ind++] = word.charAt(j);
					if(ind == ansindex + 1){
						flg = true;
						break;
					}
				}
				if(flg) break;
			}
			return res2.toString();
		}
		else{
			return res;
		}
	}
	
	private String fact(){
		if(flg) return "";
		if(Character.isDigit(str.charAt(pos))){
			StringBuilder t = new StringBuilder(""+str.charAt(pos++)) ;
			while(Character.isDigit(str.charAt(pos))){
				t.append("" +(str.charAt(pos++)));
			}
			return t.toString();
		}
		else if(str.charAt(pos) == '('){
			pos++;
			String res = exp();
			if(flg) return "";
			pos++;
			return res;
		}
		else{
			String res = "" + str.charAt(pos++);
			data[ind++] = res.charAt(0);
			if(ind == ansindex + 1) flg = true;
			return res;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner (System.in);
		final int MAX = 1000000 + 1;
		
		while(true){
			str = sc.next();
			ansindex = sc.nextInt();
			if(str.equals("0") && ansindex == 0) break;
//			for(int i=0; i < MAX; i++){
//				data[i] = '\u0000';
//			}
			data = new char[ansindex + 1];
			str += "#";
			pos = 0;
			ind = 0;
			flg = false;
			String result = exp();
			//debug
//			for(int i=0; i < data.length;i++){
//				System.out.print(data[i]);
//			}
//			System.out.println();
			if(data[ansindex] == '\u0000'){
				System.out.println(0);
				continue;
			}
			//System.out.print("ANS=");
			System.out.println(data[ansindex]);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}