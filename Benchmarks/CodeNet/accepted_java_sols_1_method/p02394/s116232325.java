import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		int[] n=new int[5];
		
		String s=null;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			s=br.readLine();
			StringTokenizer st=new StringTokenizer(s," ");
			for(int i=0;i<5;i++){
				n[i]=Integer.parseInt(st.nextToken());
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		if((n[2]-n[4])>=0&&(n[2]+n[4])<=n[0]&&(n[3]-n[4])>=0&&(n[3]+n[4])<=n[1]){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
	}

}

