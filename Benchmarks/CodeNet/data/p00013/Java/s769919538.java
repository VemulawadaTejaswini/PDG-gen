import java.util.*;
import java.io.*;
public class Main{
    public  static void main(String[] args)throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	int[] tr=new int[10];
	String a = br.readLine();
	int i=0;
	while(a!=null){
	    int aa =Integer.parseInt(a);
	    if(aa==0){
		System.out.println(tr[i-1]);
		i--;
	    }
	    else{
		tr[i]=aa;
		i++;
	    }
	   a= br.readLine();
	}
    }
}