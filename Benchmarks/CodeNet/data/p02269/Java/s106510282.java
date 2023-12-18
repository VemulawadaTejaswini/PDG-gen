import java.io.*;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		try{int n=Integer.parseInt(br.readLine());
		String[] str=new String[2];
		HashSet<Long> hs=new HashSet<Long>();		
		long hash;
		char c;
		
		for(int i=0;i<n;i++){
			str=br.readLine().split(" ");hash=0;
			for(int j=0;j<str[1].length();j++){
				c=str[1].charAt(j);
				switch(c){
				case 'A':hash=hash*10+1;break;
				case 'C':hash=hash*10+2;break;
				case 'G':hash=hash*10+3;break;
				case 'T':hash=hash*10+4;break;
				}
			}
			if(str[0].equals("insert")){
				hs.add(hash);
				
			}else if(str[0].equals("find")){
				System.out.println(hs.contains(hash)?"yes":"no");
				
			}
		}
		
		
		
		}catch(IOException e){}




	}


}