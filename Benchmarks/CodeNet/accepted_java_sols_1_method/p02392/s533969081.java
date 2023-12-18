import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		int a=0,b=0,c=0;
		String s=null;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			s=br.readLine();
			StringTokenizer st=new StringTokenizer(s," ");
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			c=Integer.parseInt(st.nextToken());
		}catch(IOException e){
			e.printStackTrace();
		}
		
		if(a<b&&b<c){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
	}

}

