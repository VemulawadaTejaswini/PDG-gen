import java.io.*;
public class Main {
	public static void main(String[] args){
		try{
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			int i=Integer.parseInt(b.readLine());
			StringBuffer[] str=new StringBuffer[i];
			String[] s;
			for(int j=0;j<i;j++){
				str[j]=new StringBuffer();
				s=b.readLine().split(" ");
				for(int k=0;k<s.length;k++){
					if(s[k].equals("Hoshino")||s[k].equals("Hoshino.")){
						s[k]="Hoshina";
						str[j].append(s[k]+" ");
					}
					str[j].deleteCharAt(str[j].length()-1);
					System.out.println(str[j].toString());
				}
			}
		}catch(IOException e){}
return 0;
	}
}