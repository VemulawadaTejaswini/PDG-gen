import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    TreeSet<String> set;
	    while((st=sc.readLine())!=null){
		int hit = 0, blow = 0;
		set = new TreeSet<String>();
		String[] a = st.split(" ");
		String[] b = sc.readLine().split(" ");
		for(int i=0; i<4; i++)
		    set.add(a[i]);
		for(int i=0; i<4; i++)
		    if(a[i].equals(b[i])){
			hit++;
			set.remove(a[i]);
		    }
		for(int i=0; i<4; i++)
		    if(set.contains(b[i]))
			blow++;
		System.out.println(hit+" "+blow);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}