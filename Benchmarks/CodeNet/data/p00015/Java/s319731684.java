import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    String s1, s2, swap;
	    int carrier, b = Integer.valueOf(sc.readLine());
	    
	    for(int i=0; i<2*b; i+=2){
		int x, y, sum;
		ArrayList<Integer> hasil = new ArrayList<Integer>();
		carrier=0;
		s1 = sc.readLine();
		s2 = sc.readLine();
		if(s1.length()<s2.length()){
		    swap = s1;
		    s1 = s2;
		    s2 = swap;
		}
		if(s1.length()>80){
		    System.out.println("overflow");
		    continue;
		}
		for(int j=0; j<s1.length(); j++){
		    x = Integer.valueOf(s1.substring(s1.length()-(j+1),s1.length()-j));
		    if(j>=s2.length())
			y = 0;
		    else
			y = Integer.valueOf(s2.substring(s2.length()-(j+1),s2.length()-j));
		    
		    sum = x+y+carrier;
		    hasil.add(sum%10);
		    carrier = sum/10;
		}
		if(carrier!=0)
		    hasil.add(carrier);
		if(hasil.size()>80){
		    System.out.println("overflow");
		    continue;
		}
		for(int z=hasil.size()-1; z>=0; z--)
		    System.out.print(hasil.get(z));
		System.out.println();
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}