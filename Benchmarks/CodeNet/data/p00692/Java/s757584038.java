import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    int n = Integer.valueOf(sc.readLine());
	    for(int i=0; i<n; i++){
		ArrayList<Integer> map = new ArrayList<Integer>();
		for(int j=0; j<5; j++){
		    String[] st = sc.readLine().split(" ");
		    for(int k=0; k<4; k++)
			map.add(Integer.valueOf(st[k]));
		}
		System.out.println(solve(map));
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
    public static int solve(ArrayList<Integer> map){
	if(map.size()==0)
	    return 0;
	int min = map.size(), now = min;
	for(int i=0; i<now; i++){
	    if((i%4)!=3 && i+1<now && map.get(i)==map.get(i+1)){
		int p = map.get(i+1), q = map.get(i);
		map.remove(i+1);
		map.remove(i);
		min = Math.min(min, solve(map));
		if(min==0)
		    break;
		map.add(i, q);
		map.add(i+1, p);
	    }
	    if((i%4)!=0 && i+3<now && map.get(i)==map.get(i+3)){
		int p = map.get(i+3), q = map.get(i);
		map.remove(i+3);
		map.remove(i);
		min = Math.min(min, solve(map));
		if(min==0)
		    break;
		map.add(i, q);
		map.add(i+3, p);
	    }
	    if(i+4<now && map.get(i)==map.get(i+4)){
		int p = map.get(i+4), q = map.get(i);
		map.remove(i+4);
		map.remove(i);
		min = Math.min(min, solve(map));
		if(min==0)
		    break;
		map.add(i, q);
		map.add(i+4, p);
	    }
	    if((i%4)!=3 && i+5<now && map.get(i)==map.get(i+5)){
		int p = map.get(i+5), q = map.get(i);
		map.remove(i+5);
		map.remove(i);
		min = Math.min(min, solve(map));
		if(min==0)
		    break;
		map.add(i, q);
		map.add(i+5, p);
	    }
	}
	return min;
    }
}