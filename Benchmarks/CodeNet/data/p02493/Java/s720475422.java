import java.io.*;
public class Main {
	static InputStreamReader sr = new InputStreamReader(System.in);
	static BufferedReader br = new BufferedReader(sr);

	public static void main(String[] args) throws IOException{
		int num;
		
		String s1 = br.readLine();
		String s2 = br.readLine();
		String[] st = s2.split(" ");
		num = Integer.parseInt(s1);

		for(int i=num; i>0; i--){
			System.out.print(st[i]);
			if(i==0) break;
			System.out.print(" ");
		}
	}

}