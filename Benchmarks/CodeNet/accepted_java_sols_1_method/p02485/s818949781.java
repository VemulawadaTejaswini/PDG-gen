import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String st;
	int it;
	while(true){
	    st = sc.next();
	    if(Integer.valueOf(st.substring(0,1))==0)
		break;
	    it = 0;
	    for(int i=0; i<st.length(); i++)
		it+=Integer.valueOf(st.substring(i,i+1));
	    System.out.println(it);
	}
    }
}