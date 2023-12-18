import java.util.Scanner;
public class Main{
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
	String[][] m = new String[2][cl];
	String lcs = "";
	int i = 1;
	int j = 1;
	for(int k = 0; k < 2; k++) m[k][0] = "";
	for(int split = 1; split < cl; split++){
	    for(int k = 0; k < cl; k++) m[0][k] = "";
	    i = 1;
	    while(i <= split){
		j = 1;
		while(j <= cl - split){
		    if(chr[i-1] == chr[j-1+split]) m[1][j] = m[0][j-1] + chr[i-1];
		    else if(m[1][j-1].length() >= m[0][j].length()) m[1][j] = m[1][j-1];
		    else m[1][j] = m[0][j];
		    j++;
		}
		for(int k = 1; k < cl; k++) m[0][k] = m[1][k];
		i++;
	    }
	    if(m[1][j-1].length() > lcs.length()) lcs = m[1][j-1];
	}
	return lcs;
    }
}