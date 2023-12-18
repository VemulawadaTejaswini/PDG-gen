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
				work += input;
				input = r.readLine();
			}
		}catch(Exception e){
			System.out.println(e);
		}
		input = work;
		input = input.toLowerCase();

		StringTokenizer st = new StringTokenizer(input," ");
		while(st.hasMoreTokens()){
			work = st.nextToken();
			for(int i = 0; i < work.length() - 3; i++){
				if(w.equals(work.substring(i,i+4))){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}