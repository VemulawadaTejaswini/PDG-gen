import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] s;
		String[] t;
		int n;
		int q;
		int i=0,
			j=0,
			count = 0;
		HashSet<String> ss = new HashSet<String>();
		//HashSet<String> tt = new HashSet<String>();
		try{
			line = reader.readLine();
			n = Integer.parseInt(line);
			line = reader.readLine();
			s = line.split(" ");
			line = reader.readLine();
			q = Integer.parseInt(line);
			line = reader.readLine();
			t = line.split(" ");
			for(i=0;i<n;i++){
				ss.add(s[i]);
			}
			for(j=0;j<q;j++){
				//tt.add(t[j]);
				if(ss.contains(t[j])){
					count++;
				}
			}
			System.out.println(count);
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}