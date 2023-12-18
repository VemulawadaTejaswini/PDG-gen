import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    boolean[] prime = new boolean[50000];
	    Arrays.fill(prime, true);
	    prime[1]=prime[0]=false;
	    for(int i=2; i<Math.sqrt(50000); i++)
		if(prime[i]){
		    for(int j=i*i; j<50000; j+=i)
			prime[j]=false;
		}
	    ArrayList<Integer> pr = new ArrayList<Integer>();
	    
	    for(int i=2; i<50000; i++)
		if(prime[i])
		    pr.add(i);
	    
	    int n, count;
	    while((n = Integer.valueOf(sc.readLine()))!=0){
		if(n%2==1)
		    if(prime[n-2])
			System.out.println(1);
		    else
			System.out.println(0);
		else{
		    count = 0;
		    for(int i=0; i<pr.size(); i++)
			for(int j=i; j<pr.size() && pr.get(i)+pr.get(j)<=n; j++)
			    if(pr.get(i)+pr.get(j)==n)
				count++;
		    System.out.println(count);
		}
	    }
    	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}