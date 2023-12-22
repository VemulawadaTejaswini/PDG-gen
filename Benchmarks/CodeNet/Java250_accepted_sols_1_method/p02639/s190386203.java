import java.util.*;
import java.lang.*;
import java.io.*;										

public class Main{
	public static void main(String args[]){
		InputStreamReader rd = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(rd);
		try{
				ArrayList<Integer> al = new ArrayList<Integer>();
				String str = br.readLine();
				String initial[] = str.split(" ");
				for(int j=0;j<initial.length;j++){
					al.add(Integer.parseInt(initial[j]));
				}
				int pos = al.indexOf(0);
				System.out.println(pos+1);
		}
		catch(Exception e){
			return;
		}
	}
}