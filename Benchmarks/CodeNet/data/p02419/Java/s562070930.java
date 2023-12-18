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
		System.out.println(work);
		input = work;
		StringTokenizer st = new StringTokenizer(work," ");
		while(st.hasMoreTokens()){
			work = st.nextToken();
			if(w.equals(work)){
				count++;
				System.out.println(work);
			}
		}
		System.out.println(count);
	}
}