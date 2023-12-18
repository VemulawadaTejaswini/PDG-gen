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

	int[][] m = new int[cl][cl];

	int tmpl = 0;
	String tmpRS = "";

	int maxl = 0;
	String maxRS = "";

	for(int i = 0; i < cl; i++){
	    for(int j = 0; j < cl; j++){
		m[i][j] = 0;
	    }
	}
	
	for(int split = 1; split < cl; split++){
	    
	    tmpl = 0;
	    tmpRS = "";
	    
	    for(int i = 1; i <= split; i++){
		for(int j = 1; j <= cl - split; j++){
		    if(chr[i-1] == chr[j-1+split]){
			m[i][j] = m[i-1][j-1] + 1;
		    }else{
			m[i][j] = Math.max(m[i-1][j],m[i][j-1]);
		    }
		
		    if(tmpl < m[i][j]){
			tmpl = m[i][j];
			tmpRS = tmpRS + chr[i-1];
		    }
		}
	    }
	    
	    if(tmpl > maxl){
		maxl = tmpl;
		maxRS = tmpRS;
	    }	    
	}
	return maxRS;
    }
}