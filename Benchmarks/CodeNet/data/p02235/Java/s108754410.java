import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	String[] str1 = new String[n];
	String[] str2 = new String[n];
	
	for(int i = 0; i < n; i++){
	    str1[i] = " "+scan.next();
	    str2[i] = " "+scan.next();
	    System.out.println(lcs(str1[i],str2[i]));
	}
	
    }

    public static int lcs(String str1,String str2){
	char[] chr1 = str1.toCharArray();
	char[] chr2 = str2.toCharArray();
	int c1 = chr1.length;
	int c2 = chr2.length;
	int maxl = 0;
	int[][] c = new int[c1][c2];

	for(int i = 0; i < c1; i++){c[i][0] = 0;}
	for(int i = 0; i < c2; i++){c[0][i] = 0;}

	for(int i = 1; i < c1; i++){
	    for(int j = 1; j < c2; j++){
		if(chr1[i] == chr2[j]){
		    c[i][j] = c[i-1][j-1]+1;
		}else{
		    c[i][j] = Math.max(c[i-1][j],c[i][j-1]);
		}
		maxl = Math.max(maxl,c[i][j]);
	    }
	}
	return maxl;
    }
}