import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String n;
		int i=1;
		n=br.readLine();
		while(n.equals("0")==false){
			System.out.println("Case "+i+": "+n);
			i++;
			n=br.readLine();
		}
	}
}