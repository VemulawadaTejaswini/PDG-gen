import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			char[] ch=str.toCharArray();
			while(true){
				for(int i=0;i<ch.length;i++){
					if(ch[i]!=' '&&ch[i]!='.'&&ch[i]!='\n'){
						ch[i]++;
					}
				}
				String newStr1=String.valueOf(ch);
				if(newStr1.matches(".*the.*")||newStr1.matches("this")||newStr1.matches(".*that.*")){
					System.out.println(newStr1);
					break;
				}
			}
		}catch(Exception e){
		}
	}
}