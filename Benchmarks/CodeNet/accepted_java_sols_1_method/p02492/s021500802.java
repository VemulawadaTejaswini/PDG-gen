import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
	int ix=0, i;
	String st = new String();
	String st1 = new String();
	String st2 = new String();
	String st3 = new String();
	ArrayList<Integer> array = new ArrayList<Integer>();
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	while(true){
	    try{
		ix++;
		st = bf.readLine();
		StringTokenizer sz = new StringTokenizer(st);
		st1 = sz.nextToken();
		st2 = sz.nextToken();
		st3 = sz.nextToken();
		if(st2.equals("?"))
		    break;
		array.add(Integer.parseInt(st1));
		array.add(Integer.parseInt(st3));
		if(st2.equals("+"))
		    array.add(1);
		else if(st2.equals("-"))
		    array.add(2);
		else if(st2.equals("*"))
		    array.add(3);
		else if(st2.equals("/"))
		    array.add(4);
		else
		    break;
	    }catch(IOException e){
		System.out.println("Error");
	    }
	}
	
	for(i=0; i<3*ix-3; i=i+3){
	    if(array.get(i+2) == 1)
		System.out.println(array.get(i)+array.get(i+1));
	    else if(array.get(i+2) == 2)
		System.out.println(array.get(i)-array.get(i+1));
	    else if(array.get(i+2) == 3)
		System.out.println(array.get(i)*array.get(i+1));
	    else if(array.get(i+2) == 4)
		System.out.println(array.get(i)/array.get(i+1));
	}
    }
}