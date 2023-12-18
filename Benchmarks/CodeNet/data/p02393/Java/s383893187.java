import java.io.*;
import java.util.Arrays;

class sansei{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	String[] line = str.split(" ");

	int a = Integer.parseInt(line[0]);
	int b = Integer.parseInt(line[1]);
	int c = Integer.parseInt(line[2]);

	int retu[] = { a , b , c};

	Arrays.sort(retu);

	System.out.println(line[0] +" "+ line[1] +" "+ line[2]);
	}
}