import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		// 入力導入部
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
				
		int x=0;
		String str=null;		
		for(;!(str=br.readLine()).equals("0");){x=0;
		
			String[] st=str.split("");
			int[] in=new int[st.length];
			for(int i=0;i<st.length;i++){
				x+=Integer.parseInt(st[i]);
				}
			System.out.println(x);
		}System.out.println();
		
		}}