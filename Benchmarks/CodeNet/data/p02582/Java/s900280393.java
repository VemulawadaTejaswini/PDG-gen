import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = 1;
		//int t = Integer.parseInt(reader.readLine());
		for(int i1 = 0;i1<t;i1++){
			char[] list = reader.readLine().toCharArray();
			int max = 0;
			int p = 0;
			for(int i = 0;i<3;i++){
					if(list[i]=='S'){
						max = Math.max(max,p);
						p=0;
					}
					else p++;
			}
			max = Math.max(p,max);
			System.out.println(	max);
		}
	}
}