import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	ArrayList<String> a, xx;
	a = new ArrayList<String>();
	xx = new ArrayList<String>();
	String st;
	while(true){
	    st = sc.next();
	    if(st.equals("quit"))
		break;
	    if(st.equals("push")){
		a.add(sc.next());
		continue;
	    }
	    if(st.equals("pop")){
		xx.add(a.get(a.size()-1));
		a.remove(a.size()-1);
		continue;
	    }
	}
	for(int i=0; i<xx.size(); i++)
	    System.out.println(xx.get(i));
    }
}