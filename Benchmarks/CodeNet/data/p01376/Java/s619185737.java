import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	String s=r.readLine();
	String[] t;
	t=s.split(" ");
	int[] n=new int[t.length];
	for(int i=0;i<t.length;i++){
	    n[i]=Integer.parseInt(t[i]);
	}
	int nm=n[0];
	int[] count=new int[nm];
	for(int j=0;j<n[0];j++){
	    String a=r.readLine();
	    String[] alpha;
	    alpha=a.split(" ");
	    int gh=alpha.length;
	    int[] number=new int[gh];
	    for(int k=0;k<alpha.length;k++){
		number[k]=Integer.parseInt(alpha[k]);
	    }
	    for(int l=0;l<n[1];l++){
		if(number[l]==1){
		    count[j]++;
		}
	    }
	}
        Arrays.sort(count);
        System.out.println(count[nm-1]);
    }
}	