import java.io.*;
import java.util.*;

public class Main{

    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int n=Integer.parseInt(br.readLine());

	for(int i=0;i<n;i++){
	    String str1=br.readLine();
	    String str2=br.readLine();

	    System.out.println(lcs(str1,str2));
	}
    }
    
    static int lcs(String str1,String str2){
	int m=str1.length();
	int n=str2.length();

	str1=" "+str1+" ";
	str2=" "+str2+" ";

	String s1[]=str1.split("");
	String s2[]=str2.split("");

	
	int c[][]=new int[m+1][n+1];

	int max=0;

	for(int i=0;i<=m;i++){
	    c[i][0]=0;
	}

	for(int i=0;i<=n;i++){
	    c[0][i]=0;
	}

	for(int i=1;i<=m;i++){
	    for(int j=1;j<=n;j++){
		if(s1[i].equals(s2[j])){
		    c[i][j]=c[i-1][j-1]+1;
		}else{
		    c[i][j]=Math.max(c[i-1][j],c[i][j-1]);
		}
		max=Math.max(max,c[i][j]);
	    }
	}

	return max;
    }
}

