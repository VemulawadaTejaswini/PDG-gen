import java.io.*;

public class Main{
	public static void main(String[] args){
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s;
			while((s=reader.readLine()) !=null){
				String[] t=s.split(" ");
				int[] r=new int[t.length];
				for(int i=0;i<t.length;i++){
					r[i]=Integer.parseInt(t[i]);
				}
				int c =r[0]+r[1];
				System.out.println(c);
			}
		}catch(IOException e){
			System.exit(0);
		}
	}
}