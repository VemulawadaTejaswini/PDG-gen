import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		int[] n=new int[2];
		while(true){
			s=reader.readLine();
			t=s.split(" ");
			for(int i=0;i<2;i++){
				n[i]=Integer.parseInt(t[i]);
			}
			if(n[0]==0 &&n[1]==0){
				System.exit(0);
			}
			Arrays.sort(n);
			System.out.println(n[0]+" "+n[1]);
		}
	}
}