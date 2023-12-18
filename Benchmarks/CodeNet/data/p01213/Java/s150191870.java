import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	String str = "";
	
	while(true){
	    str = scan.next();
	    if(str.equals("#END")){
		break;
	    }else{
		System.out.println(rs(str));
	    }	    
	}
    }


    public static String rs(String str){
	char[] chr = str.toCharArray();
	int cl = chr.length;
	String[][] RS = new String[cl][cl];
	int split = 1;
	int maxl = 0;
	String maxRS = "";

	for(int i = 0; i < cl; i++){RS[i][0] = "";}
	for(int i = 0; i < cl; i++){RS[0][i] = "";}

	for(int k = 1; k < cl-1; k++){
	    for(int i = 1; i <= split; i++){
		for(int j = 1; j <= cl - split; j++){
		    if(chr[i-1] == chr[j-1+split]){
			RS[i][j] = RS[i-1][j-1] + chr[i-1];
		    }else if(RS[i-1][j].length() >= RS[i][j-1].length()){
			RS[i][j] = RS[i-1][j];
		    }else{
			RS[i][j] = RS[i][j-1];
		    }
		    if(maxl < RS[i][j].length()){
			maxl = RS[i][j].length();
			maxRS = RS[i][j];
		    }
		}
	    }
	    split++;
	}
	return maxRS;
    }
}