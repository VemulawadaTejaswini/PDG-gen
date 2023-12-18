import java.io.*;

public class Main{
	public static void main(String args[]){
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		try{
			int flag=1,sum;
			char c;
			String line;
			while(flag==1){
				line=reader.readLine();
				if(line.equals("0")){
					flag=0;
					continue;
				}
				sum=0;
				for(int i=0;i<line.length();i++){
					c=line.charAt(i);
					sum+=c-'0';
				}
				System.out.println(sum);
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}