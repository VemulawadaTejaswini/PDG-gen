import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = reader.readLine();
		int n = Integer.parseInt(line1);//1stLine
		String line2 = reader.readLine();//2ndLine
		String[] sarray = line2.split(" ", -1);
		for(int i = 0; i < (n - 1); i++){
			System.out.print(Integer.parseInt(sarray[(n - i - 1)]) + " ");
		}
		System.out.println(Integer.parseInt(sarray[0]));
	}
}