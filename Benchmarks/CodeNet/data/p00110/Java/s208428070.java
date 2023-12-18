import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
	String st;
	while((st=sc.readLine())!=null){
	String out = "NA";
	root:
	for(int i=0; i<=9; i++){
		String sp = st.replaceAll("X",Integer.toString(i));
		String[] ap = sp.split("[^0-9]+");
		if(ap[0].charAt(0)=='0' || ap[1].charAt(0)=='0' || ap[2].charAt(0)=='0')
			continue;
		if(Integer.valueOf(ap[2])==Integer.valueOf(ap[0])+Integer.valueOf(ap[1])){
			out = Integer.toString(i);
			break root;
			}
	}	
	System.out.println(out);
	}
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}