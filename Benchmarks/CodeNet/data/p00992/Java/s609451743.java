import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    int count=0, n = Integer.valueOf(sc.readLine());
	    int[] map = new int[n];
	    for(int i=0; i<n; i++)
		map[i] = Integer.valueOf(sc.readLine());
	    Arrays.sort(map);
	    for(int i=0; i<n/2; i++){
		int a = map[i];
		map[i] = map[n-1-i];
		map[n-1-i] = a;
	    }
	    int p=4, kez=0;
	    while(map[0]!=0){
		if(n-kez>p)
		    count+=p;
		else
		    count+=n-kez;
		int now = kez;
		for(int i=0; i<n-now; i++){
		    if(map[i]==1)
			kez++;
		    map[i]-=1;
		}
		p+=4;
	    }
	    System.out.println(count+1);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}