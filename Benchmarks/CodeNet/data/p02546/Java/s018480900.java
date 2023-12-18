import java.lang.*;
import java.io.*;
class Plural{
    public static void main(String[] args) throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String str = new String(in.readLine());
	if(str != null && str.endsWith("s")){
	    str += "es";
	}else if(str != null){
	    str += "s";
	}
	System.out.println(str);
	
    }
}