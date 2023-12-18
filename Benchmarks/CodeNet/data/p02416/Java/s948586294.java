import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		// 入力導入部
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		

		int x=0;
		String str;
		for(;(str=br.readLine())!="0";){
			x=0;
			
			if(str.equals("0"))break;
			else{
			String[] st=str.split("");
			for(int i=0;i<st.length;i++){
				x+=Integer.parseInt(st[i]);
				}}
			System.out.println(x);
		}br.close();

		}}