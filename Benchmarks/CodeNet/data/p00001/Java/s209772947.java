import java.io.*;
import java.util.*;
 
class Main{
    public static void main(String[] a) throws Exception{
    	BufferedReader[] br=null;
    	String[] str=null;
 
    	for(int i=0;i<10;i++){
    		br[i]=new BufferedReader(new InputStreamReader(System.in));
    	}
 
    	for(int i=0;i<br.length;i++){
    		str[i]=br[i].readLine();
    	}
    	Arrays.sort(str);
		for(int i=0;i<3;i++){
			System.out.println(str[i]);
		}    	
    }
}