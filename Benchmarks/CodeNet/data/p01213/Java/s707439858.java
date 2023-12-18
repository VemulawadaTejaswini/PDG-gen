import java.util.Scanner;
public class RepeatedSubsequences{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String str = "";	
	while(true){
	    str = scan.next();
	    if(str.equals("#END")){
		return;
	    }else{
		str = rs(str);
		System.out.println(str);
	    }	    
	}
    }
    public static String rs(String str){
	char[] chr = str.toCharArray();
	int cl = chr.length;
	int[][] m = new int[cl][cl];
	String[] tmpLCS = new String[(cl/2)+1];
	String lcs = "";
	int i = 1;
	int j = 1;
	for(int k = 0; k < cl; k++) m[k][0] = 0;
	for(int k = 0; k < cl; k++) m[0][k] = 0;
	for(int split = 1; split < cl; split++){
	    for(int k = 0; k < cl/2; k++) tmpLCS[k] = "";
	    i = 1;
	    while(i <= split){
		j = 1;
		while(j <= cl - split){
		    if(chr[i-1] == chr[j-1+split]){
			m[i][j] = m[i-1][j-1] + 1;
			tmpLCS[m[i][j]] = tmpLCS[m[i][j]-1] + chr[i-1];
		    }else{
			m[i][j] = Math.max(m[i-1][j],m[i][j-1]);
		    }
		    j++;
		}
		i++;
	    }
	    if(m[i-1][j-1] >= lcs.length()) lcs = tmpLCS[m[i-1][j-1]];
	}
	return lcs;
    }
}