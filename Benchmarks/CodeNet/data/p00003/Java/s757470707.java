import java.io.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] argv) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int lineNum = Integer.parseInt(br.readLine());
		for(int i=0; i<lineNum; i++){
			String[] line = br.readLine().split(" ");
			int[] lineInt = {Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2])};
			Arrays.sort(lineInt);
			String out;
			if((lineInt[2] * lineInt[2]) == (lineInt[0] * lineInt[0] + lineInt[1] * lineInt[1])){
				out = "YES";
			}else{
				out = "NO";
			}
			System.out.print(out+"\n");
		}
	}
}