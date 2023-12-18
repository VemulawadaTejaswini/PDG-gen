import java.io.*;
import java.util.*;

class Main{
	public int count=0;
	
	public void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		for(int i=a; i<=b; i++){
			if(c%i == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}