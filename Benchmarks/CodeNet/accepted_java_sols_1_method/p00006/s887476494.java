import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		String str = "",rts="";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		if((str=bf.readLine())==null)return;
		bf.close();
		for(int i=str.length()-1;i>=0;i--)rts+=str.charAt(i);
		System.out.println(rts);
	}
}