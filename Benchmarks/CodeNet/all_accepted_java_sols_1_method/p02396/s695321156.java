import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<String> lst=new ArrayList<String>();
		boolean roop=true;
		while(roop){
			String s=br.readLine();
			lst.add(s);
			if(s.equals("0"))roop=false;
		}
		for(int i=0;i<(lst.size()-1);i++){
			System.out.println("Case "+(i+1)+": "+lst.get(i));
		}
		
	}
}