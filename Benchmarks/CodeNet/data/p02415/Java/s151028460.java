import java.io.*;
public class Main {
	void run(){
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str = "";
		try{
		str = br.readLine();
		}catch(IOException e){
			System.out.println(e);
		}
		char c[] = str.toCharArray();
		for(int i = 0;i < c.length;i++){
			if(Character.isUpperCase(c[i])){
				c[i] = Character.toLowerCase(c[i]);
			}else if(Character.isLowerCase(c[i])){
				c[i] = Character.toUpperCase(c[i]);
			}
			System.out.print(c[i]);
		}
		System.out.println("");
	}
	public static void main(String args[]){
		Main m = new Main();
		m.run();
	}
}