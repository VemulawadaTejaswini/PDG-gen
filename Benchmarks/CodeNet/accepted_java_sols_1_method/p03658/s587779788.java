import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s[]=br.readLine().split(" ");

        int n=Integer.parseInt(s[0]);
	int k=Integer.parseInt(s[1]);

	int bou[]=new int[n];

	int sum=0;

	s=br.readLine().split(" ");
	
	for(int i=0;i<n;i++){
	    bou[i]=Integer.parseInt(s[i]);
	}

	
	
	for(int i=0;i<k;i++){
	    int max=0;
	    int maxID=0;
	    for(int j=0;j<n;j++){
		if(max<bou[j]){
		    max=bou[j];
		    maxID=j;
		}
	    }
	    sum+=max;
	    bou[maxID]=0;
	}
	System.out.println(sum);
    }
}
