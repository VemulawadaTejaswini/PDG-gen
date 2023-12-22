import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    int n;
	    Map<Integer, Integer> map;
	    while(true){
		n = Integer.valueOf(sc.readLine());
		if(n==0)
		    break;
		String[] st = sc.readLine().split(" ");
		int[] lho, kok;
		lho = new int[n];
		for(int i=0; i<n; i++)
		    lho[i] = Integer.valueOf(st[i]);
		map = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++){
		    if(!map.containsKey(lho[i]))
			map.put(lho[i],1);
		    else{
			int b = map.get(lho[i]);
			map.remove(lho[i]);
			map.put(lho[i],b+1);
		    }
		}
		int count = 0;
		kok = new int[n];
		while(true){
		    kok = lho.clone();
		    for(int i=0; i<n; i++)
			lho[i] = map.get(lho[i]);
		    map.clear();
		    for(int i=0; i<n; i++){
			if(!map.containsKey(lho[i]))
			    map.put(lho[i],1);
			else{
			    int b = map.get(lho[i]);
			    map.remove(lho[i]);
			    map.put(lho[i],b+1);
			}
		    }
		    if(Arrays.equals(lho,kok))
			break;
		    count++;
		}
		System.out.println(count);
		for(int i=0; i<n-1; i++)
		    System.out.print(lho[i]+" ");
		System.out.println(lho[n-1]);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}