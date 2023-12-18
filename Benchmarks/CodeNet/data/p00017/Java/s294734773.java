import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String str=br.readLine();
			char[] ch=str.toCharArray();
			while(true){
				for(int i=0;i<ch.length;i++){
					if('a'<=ch[i]&&ch[i]<='z'){	//a〜zでプラスしてループ
						ch[i]++;
					}else if(ch[i]=='z') ch[i]='a';	//zの次はa
				}
				String newStr=String.valueOf(ch);
				if(newStr.matches(".*the.*")||newStr.matches("this")||newStr.matches(".*that.*")){
					System.out.println(newStr);
					break;
				}
			}
		}catch(Exception e){
		}
	}
}