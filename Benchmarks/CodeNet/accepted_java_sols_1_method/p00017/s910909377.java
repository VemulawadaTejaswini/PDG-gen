import java.io.*;
import java.util.regex.Pattern;;
class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    Pattern patt = Pattern.compile("this|that|the");
	    String st;
	    while((st=sc.readLine())!=null){
		char[] xx = st.toCharArray();
		for(int i=0; !patt.matcher(String.valueOf(xx)).find() & i<26; i++)
		    for(int j=0; j<xx.length; j++){
			if(xx[j]>='a' && xx[j]<'z')
			    xx[j]++;
			else if(xx[j]=='z')
			    xx[j]='a';
		    }
		System.out.println(xx);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}