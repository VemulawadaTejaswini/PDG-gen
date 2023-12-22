import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//BufferedReader cin = new BufferedReader(new FileReader("in.txt"));
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> words = new ArrayList<String>();
		int maxlen =0;
		String max_count ="";
		String max_len ="";
		String line;
		while((line=cin.readLine())!=null&&line.length()!=0){
			String[] parts = line.split("[\\s]+");
			int l = parts.length;
			for(int i=0;i<l;i++){
				words.add(parts[i]);
				int wl = parts[i].length();
				if(wl>maxlen){
					max_len =parts[i];
					maxlen=wl;
				}
			}
		}
		
		Collections.sort(words);
		ArrayList<String> unique = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		int s = words.size();
		for(int i=0;i<s;i++){
			if(i==0||(words.get(i).equals(words.get(i-1)))==false){
				unique.add(words.get(i));
				count.add(1);
			}
			else{
				int size = count.size();
				int temp = count.get(size-1);
				count.set(size-1,temp+1);
			}
		}
		int ss=unique.size();
		int freq =0;
		for(int i=0;i<ss;i++){
			if(count.get(i)>freq){
				max_count = unique.get(i);
				freq = count.get(i);
			}
		}
		
		System.out.println(max_count+" "+max_len);
		cin.close();
	}
	
}