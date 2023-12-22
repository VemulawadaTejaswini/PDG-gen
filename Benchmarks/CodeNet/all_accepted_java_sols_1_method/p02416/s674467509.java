import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> ans = new ArrayList<Integer>();
		char ch[] = new char[1000];
		int len, sum;
		String str;
		
		while(true){
			str = br.readLine();
			if(str.equals("0")){
				break;
			}
			
			sum = 0;
			len = str.length();
			ch = str.toCharArray();
			
			for(char c : ch){
				sum += Character.digit(c, 10);
			}
			
			ans.add(sum);
		}
		
		for(int i : ans){
			System.out.println(i);
		}
	}
}