import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args){
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in),1200);
		String w = "";
		String work = "";
		String input = "";
		int count = 0;
		try{
			w = r.readLine();
			input = r.readLine();
			while(input != null){
				work += " ";
				work += input;
				input = r.readLine();
			}
		}catch(Exception e){
			System.out.println(e);
		}
		//System.out.println("w:"+w);
		//System.out.println("wcount:"+w.length());
		input = work;
		input = input.toLowerCase();
		//System.out.println(input);
		StringTokenizer st = new StringTokenizer(input," ");
		while(st.hasMoreTokens()){
			work = st.nextToken();
			if(work.length() < w.length()){
					continue;
			}else{
				/*for(int i = 0; i < work.length() - (w.length() - 1); i++){
					if(w.equals(work.substring(i,i + w.length()))){
						count++;
						break;
						//i = i + w.length() - 1;
					}
				}
				*/
				if(w.equals(work)){
					count++;
				}
			}
		}
		
		
		System.out.println(count);
	}
}