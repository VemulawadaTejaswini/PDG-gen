import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    while((st=sc.readLine())!=null){
		int[][] map = new int[12][12];
		for(int i=0; i<8; i++)
		    if(st.charAt(i)=='1')
			map[1][i+1] = 1;		
		for(int j=1; j<8; j++){
		    st=sc.readLine();
		    for(int i=0; i<8; i++)
			if(st.charAt(i)=='1')
			    map[j+1][i+1] = 1;
		}
		int sj=0, si=0;
		back:
		for(int j=1; j<=8; j++)
		    for(int i=1; i<=8; i++)
			if(map[j][i]==1){
			    sj = j; si = i;
			    break back;
			}
		char e;
		
		if(map[sj+3][si] == 1)
		    e = 'B';
		else if(map[sj][si+3] == 1)
		    e = 'C';
		else if(map[sj+2][si-1] == 1)
		    e = 'D';
		else if(map[sj+2][si+1] == 1)
		    e = 'F';
		else
		    if(map[sj+1][si] == 0)
			e = 'E';
		    else if(map[sj+1][si+1] == 0)
			e = 'G';
		    else
			e = 'A';
		System.out.println(e);
		st = sc.readLine();
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}