import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[] t;
		int[] r =new int[5];
		try{
			while((s=reader.readLine()) !=null){
				t =s.split(" ");
				for(int j=0;j<5;j++){
					r[j]=0;
				}
				for(int i=0;i<t.length;i++){
					r[i]=Integer.parseInt(t[i]);
				}
				Arrays.sort(r);
				System.out.println(r[4]+" "+r[3]+" "+r[2]+" "+r[1]+" "+r[0]);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}