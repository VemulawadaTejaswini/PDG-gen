import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main{ 
    
    public static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	boolean[] pri = new boolean[1000001];
	
        for(int i=0;i<=1000000;i++){
	    pri[i]=true;
	}
	pri[0]=false;
	pri[1]=false;
	for(int i=3;i<=1000000;i++){
	    if(i%2==0)
		pri[i]=false;
	}
	for(int i=3;i<=1000000;i++){
	    if(pri[i]){
		for(int j=2*i;j<=1000000;j+=i)
		    pri[j]=false;
	    }
	}
	String line;
	while((line=br.readLine()) !=null){
	    int cnt=0;
	    int n=Integer.parseInt(line);
	    for(int i=0;i<=n;i++)
		if(pri[i])
		    cnt++;
	
	System.out.println(cnt);
	}
    }
}