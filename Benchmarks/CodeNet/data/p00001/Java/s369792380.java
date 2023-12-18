import java.util.*;
import java.io.*;
import java.lang.*;

class AOJ0001{

    public static void main(String args[]){
	//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner in= new Scanner(System.in);
	List<Integer> vec = new ArrayList<Integer>();
	for(int i=0;i<10;i++){
	    int val;
	    val = in.nextInt();
	    vec.add(val);
	}

	Collections.sort(vec,new Comparator<Integer>(){
		
			 @Override
			     public int compare(Integer a,Integer b){
			     return b.compareTo(a);
			 }
			 
	    });
	for(int i=0;i<3;i++){
	    System.out.println(vec.get(i));
	}	
	
    }
    
}