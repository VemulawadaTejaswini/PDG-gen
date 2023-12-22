import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		int i=1;
		try{
			while(( buf = reader.readLine() )!=null){
				int num = Integer.parseInt(buf);
				if(num==0){
					break;
				}else{
					System.out.println("Case "+i+": "+num);
					i++;
				}
			} 
		} catch(IOException e){
			System.out.println(e);
		}
	}
}