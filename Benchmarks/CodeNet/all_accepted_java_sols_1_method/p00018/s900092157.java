import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		int[] n;
		int number;
		while((s=reader.readLine())!=null){
			t=s.split(" ");
			number=t.length;
			n=new int[number];
			for(int i=0;i<number;i++){
				n[i]=Integer.parseInt(t[i]);
			}
			Arrays.sort(n);
			for(int j=number-1;j>=0;j--){
				System.out.print(n[j]);
				if(j!=0){
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}