import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		try{
			while((str=br.readLine())!=null){
				char[] ch=str.toCharArray();
				for(int i=0;i<ch.length;i++){
					if('a'<=ch[i]&&'z'>=ch[i]){
						ch[i]-=32;
					}
				}
				System.out.println(ch);
			}
		}catch(Exception e){
		}
	}
}