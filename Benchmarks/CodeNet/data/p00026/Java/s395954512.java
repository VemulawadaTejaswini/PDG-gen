import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main{

    static void sho(int x,int y,int[][] inku){
    for(int i=x-1;i<x+2;i++)
	if(i<10&&i>-1)
	    inku[i][y]++;
    for(int i=y-1;i<y+2;i++)
	if(i<10&&i>-1)
	    inku[x][i]++;
    inku[x][y]--;
}

static void chu(int x, int y,int[][] inku){
    for(int i=x-1;i<x+2;i++)
	for(int j=y-1;j<y+2;j++)
	    if(i<10&&i>-1&&j<10&&j>-1)
		inku[i][j]++;
}
static void dai(int x,int y,int[][] inku){
    chu(x,y,inku);
    if(x+2<10&&x+2>-1)
	inku[x+2][y]++;
    if(x-2<10&&x-2>-1)
	inku[x-2][y]++;
    if(y+2<10&&y+2>-1)
	inku[x][y+2]++;
    if(y-2<10&&y-2>-1)
	inku[x][y-2]++;
}


    
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	int[][] inku = new int[10][10];
	String line ;
	int cnt=0,max=0;
	while((line=br.readLine())!=null){
	    StringTokenizer st = new StringTokenizer(line,",");
	    int x=Integer.parseInt(st.nextToken());
	    int y =Integer.parseInt(st.nextToken());
	    int size = Integer.parseInt(st.nextToken());
	    if(size==1)
		sho(x,y,inku);
	    if(size==2)
		chu(x,y,inku);
	    if(size==3)
		dai(x,y,inku);
	}
	for(int i=0;i<10;i++){
	    for(int j=0;j<10;j++){
		if(inku[i][j]==0)
		    cnt++;
		if(inku[i][j]>max)
		    max=inku[i][j];
	    }
	}
	System.out.println(cnt);
	System.out.println(max);
    }
}
    