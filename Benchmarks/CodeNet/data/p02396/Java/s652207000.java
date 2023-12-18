import java.io.*;
import java.util.*;
class Main{
    public static void main(String args[]) throws IOException{
	int w=1;
	int i=0,j=0,k=0;
	int[] arry;
	arry=new int[1000];
	while(w>0)
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    j=Integer.parseInt(str);
	    if(j==0)break;
	    arry[i]=j;
	    i++;
	    k=i;
	}
	for(int m=0;m<k;m++){
	    System.out.println("Case "+ (w+m) +": "+arry[m]);
	}
    }
}