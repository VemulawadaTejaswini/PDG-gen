import java.io.*;

public class Main{
	public static void main(String args[]){
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		try{
			while(1>0){
				String line=reader.readLine();
				if(line.equals("-"))break;
				String str=line;
				line=reader.readLine();
				int m=Integer.parseInt(line);;
				int[] h;
				h=new int[m];
				for(int i=0;i<m;i++){
					line=reader.readLine();
					h[i]=Integer.parseInt(line);
					String str2="",str3="";
					for(int j=0;j<h[i];j++)str2+=str.charAt(j);
					for(int j=h[i];j<str.length();j++)str3+=str.charAt(j);
					str3+=str2;
					str=str3;
				}
				System.out.println(str);
			}
		}catch (IOException e){
			System.out.println(e);
		}
	}
};