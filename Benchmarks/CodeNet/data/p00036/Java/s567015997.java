import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main{ 
    
    public static void main(String[] args)throws IOException{
	try{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String line;
 	    int[][] f=new int[8][8];
	    do{
		
		
	    for(int i=0;i<8;i++){
		line=br.readLine();
		for(int j=0;j<8;j++){
		    f[i][j]=Character.getNumericValue(line.charAt(j));
		}
	    }
	    hantei(f);
	    }while((line=br.readLine())!=null);
		}catch(java.lang.NumberFormatException e)
	    {
	    }
    }

    
    static void hantei(int[][] f){
	for(int i=0;i<8;i++){
	    for(int j=0;j<8;j++){
		if(f[i][j]==1){
		    if(f[i][j+1]==1){
			if(f[i][j+2]==1){
			    if(f[i][j+3]==1)
			    System.out.println("C");
			}
			if(f[i+1][j]==1){
			    if(f[i+1][j+1]==1){
				System.out.println("A");
			    }
			    if(f[i+1][j-1]==1){
				if(f[i+1][j]==1)
				System.out.println("G");
			    }
			}
			else if(f[i+1][j+1]==1)
			    System.out.println("E");
		    }
		    if(f[i+1][j]==1){
			if(f[i+2][j]==1)
			    System.out.println("B");
			if(f[i+2][j-1]==1)
			    System.out.println("D");
			if(f[i+2][j+1]==1)
			    System.out.println("F");
		    }
		    return;
		}
	    }
	}
    }
		
}