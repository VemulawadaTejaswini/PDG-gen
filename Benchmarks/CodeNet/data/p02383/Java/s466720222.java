import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
    	out.println(
    			new Dice(br.readLine().split(" "))
    			.rolling(br.readLine().toCharArray())
    			.get(Dice.LABEL_TOP));
        out.flush();
    }
	
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}

class Dice {
	public static final int LABEL_TOP=0;
	public static final int LABEL_NEAR=1;
	public static final int LABEL_RIGHT=2;
	public static final int LABEL_LEFT=3;
	public static final int LABEL_FAR=4;
	public static final int LABEL_BOTTOM=5;
	public static final int LABEL_MAX=6;
	public static final int DIR_N=0;
	public static final int DIR_W=1;
	public static final int DIR_S=2;
	public static final int DIR_E=3;
	public static final int DIR_MAX=4;
	public static final int[][] NEXT = {
			//[LABEL_TOP][DIR_N,W,S,E]
			{LABEL_FAR,LABEL_LEFT,LABEL_NEAR,LABEL_RIGHT},
			//[LABEL_NEAR][DIR_N,W,S,E]
			{LABEL_TOP,LABEL_NEAR,LABEL_BOTTOM,LABEL_NEAR},
			//[LABEL_RIGHT][DIR_N,W,S,E]
			{LABEL_RIGHT,LABEL_TOP,LABEL_RIGHT,LABEL_BOTTOM},
			//[LABEL_LEFT][DIR_N,W,S,E]
			{LABEL_LEFT,LABEL_BOTTOM,LABEL_LEFT,LABEL_TOP},
			//[LABEL_FAR][DIR_N,W,S,E]
			{LABEL_BOTTOM,LABEL_FAR,LABEL_TOP,LABEL_FAR},
			//[LABEL_BOTTOM][DIR_N,W,S,E]
			{LABEL_NEAR,LABEL_RIGHT,LABEL_FAR,LABEL_LEFT},
	};
	String[][] labels = new String[2][LABEL_MAX];
	int main=0;
	int sub=1;
	public Dice(String[] strLabels){
		labels[0]=strLabels;
	}
	public String get(int label) {
		return labels[main][label];
	}
	private void switchMainSub() {
		main = sub;
		sub = (sub+1)%2;
	}
	public int getDir(char c) {
		switch(c){
		case 'N': return 0;
		case 'W': return 1;
		case 'S': return 2;
		case 'E': return 3;
		default: throw new IllegalArgumentException();
		}
	}
	public Dice rolling(char[] cArray) {
		for(char c: cArray){
			rolling(c);
		}
		return this;
	}
	public Dice rolling(char c) {
		int dir = getDir(c);
		for(int label=0; label<LABEL_MAX; label++) {
			labels[sub][NEXT[label][dir]]=labels[main][label];
		}
		switchMainSub();
		return this;
	}
	
}