import java.io.*;
class Main {
public static void main(String[] args)throws IOException {
	BufferedReader br =
		new BufferedReader(new InputStreamReader (System.in));
		
		String a = br.readLine();
		String b = a.substring(0,1),c = a.substring(2,3);
		int d = Integer.parseInt(b),e = Integer.parseInt(c);
		
		System.out.println(d*e+" "+(d*2+e*2));
		}
}