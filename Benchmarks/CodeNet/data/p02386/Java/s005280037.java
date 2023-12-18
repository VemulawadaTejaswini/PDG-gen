import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        Dice[] dArray = new Dice[n];
        for(int i=0; i<n; i++) {
        	dArray[i] = new Dice(br.readLine().split(" "));
        }
        boolean checkAllNotEqual = true;
        for(int i=0; i<n-1; i++) {
        	for(int j=i+1; j<n; j++) {
        		if(dArray[i].equals(dArray[j])){
        			checkAllNotEqual=false;
        			break;
        		}
        	}
        }
        out.println(checkAllNotEqual?"Yes":"No");
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
	public static final int[][] TOP_NEAR = {
			//T
			{
				-1,//T-T
				LABEL_RIGHT,//T-N
				LABEL_FAR,//T-R
				LABEL_NEAR,//T-L
				LABEL_LEFT,//T-F
				-1,//T-B
			},
			//N
			{
				LABEL_LEFT,//N-T
				-1,//N-N
				LABEL_TOP,//N-R
				LABEL_BOTTOM,//N-L
				-1,//N-F
				LABEL_RIGHT,//N-B
			},
			//R
			{
				LABEL_NEAR,//R-T
				LABEL_BOTTOM,//R-N
				-1,//R-R
				-1,//R-L
				LABEL_TOP,//R-F
				LABEL_FAR,//R-B
			},
			//L
			{
				LABEL_FAR,//L-T
				LABEL_TOP,//L-N
				-1,//L-R
				-1,//L-L
				LABEL_BOTTOM,//L-F
				LABEL_NEAR,//L-B
			},
			//F
			{
				LABEL_RIGHT,//F-T
				-1,//F-N
				LABEL_BOTTOM,//F-R
				LABEL_TOP,//F-L
				-1,//F-F
				LABEL_LEFT,//F-B
			},
			//B
			{
				-1,//B-T
				LABEL_LEFT,//B-N
				LABEL_NEAR,//B-R
				LABEL_FAR,//B-L
				LABEL_RIGHT,//B-F
				-1,//B-B
			},
	};
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
	public String get(String topLabel, String nearLabel){
		int toTopDir=-1;
		int toNearDir=-1;
		for(int label=0; label<LABEL_MAX && (toTopDir<0 || toNearDir<0); label++){
			if(topLabel.equals(labels[main][label])) {
				toTopDir=label;
			}else if(nearLabel.equals(labels[main][label])) {
				toNearDir=label;
			}
		}
		return get(TOP_NEAR[toTopDir][toNearDir]);
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
	public boolean equals(Dice d) {
		int[] lConv = new int[6];
		for(lConv[LABEL_TOP]=0; lConv[LABEL_TOP]<LABEL_MAX; lConv[LABEL_TOP]++) {
			INLOOP:
			for(lConv[LABEL_NEAR]=0; lConv[LABEL_NEAR]<LABEL_MAX; lConv[LABEL_NEAR]++) {
				lConv[LABEL_RIGHT] = TOP_NEAR[lConv[LABEL_TOP]][lConv[LABEL_NEAR]];
				if(lConv[LABEL_RIGHT] == -1) continue;
				lConv[LABEL_BOTTOM] = (LABEL_MAX-lConv[LABEL_TOP]-1);
				lConv[LABEL_FAR] = (LABEL_MAX-lConv[LABEL_NEAR]-1);
				lConv[LABEL_LEFT] = (LABEL_MAX-lConv[LABEL_RIGHT]-1);
				for(int label=0;label<LABEL_MAX;label++) {
					if(!this.get(label).equals(d.get(lConv[label])))
						continue INLOOP;
				}
				return true;
			}
		}
		return false;
	}
	
}