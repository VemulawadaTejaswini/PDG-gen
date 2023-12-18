import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		try{
			int n = Integer.valueOf(sc.readLine());
			StringBuilder sb = new StringBuilder();
			for(int i=0; i<n; i++){
				String st = sc.readLine().replaceAll("Hoshino","Hoshina");
				sb.append(st+"\n");
			}
			System.out.println(sb.toString());
		}catch(Exception e){
			System.out.println("Error");
			}
		}
}