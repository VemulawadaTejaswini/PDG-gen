import java.io.*;
public class Main {
	public static void main(String[] args){
		try{
			int j,k;
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			int i=Integer.parseInt(b.readLine());
			StringBuffer[] str=new StringBuffer[i];
			String[] s;
			for(j=0;j<i;j++){
				str[j]=new StringBuffer();
				s=b.readLine().split(" ");
				for(k=0;k<s.length;k++){
					s[k]=s[k].replaceAll("Hoshino", "Hoshina");
					str[j].append(s[k]+" ");
				}
				str[j].deleteCharAt(str[j].length()-1);
			}
			for(j=0;j<i;j++)System.out.println(str[j].toString());
		}catch(IOException e){}
	}
}