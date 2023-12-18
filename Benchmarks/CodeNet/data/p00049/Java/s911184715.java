import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=0,b=0,o=0,ab=0;
		String str;
		String[] data = new String[2];
		while((str = br.readLine()) != null){			
			data = str.split(",");
			if(data[1].equals("A"))
				a++; 
			else if(data[1].equals("B"))
				b++; 
			else if(data[1].equals("O"))
				o++; 
			else if(data[1].equals("AB"))
				ab++; 
		}
		System.out.println(a+"\r\n"+b+"\r\n"+o+"\r\n"+ab);
	}
}