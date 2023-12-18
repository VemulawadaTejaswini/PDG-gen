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
	
	String[][] m = new String[cl][cl];
	String lcs = "";
	int i = 1;
	int j = 1;
	
	for(int k = 0; k < cl; k++) m[k][0] = "";
	for(int k = 0; k < cl; k++) m[0][k] = "";
	
	for(int split = 1; split < cl; split++){  
	    i = 1;
	    while(i <= split){
		j = 1;
		while(j <= cl - split){
		    if(chr[i-1] == chr[j-1+split]){
			m[i][j] = m[i-1][j-1] + chr[i-1];
		    }else if(m[i][j-1].length() >= m[i-1][j].length()){
			m[i][j] = m[i][j-1];}
		    else{
			m[i][j] = m[i-1][j];
		    }
		    j++;
		    
		}
		i++;
	    }
	    if(m[i-1][j-1].length() > lcs.length()){
		lcs = m[i-1][j-1];
	    }
	}
	return lcs;
    }
}