import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		while(true){
			int ans = 0;
			String line = in.next();
			if(line.equals("0")) break;
			char ch[] = line.toCharArray();
			for(int i=0; i<ch.length; i++){
				ans = ans + (int)ch[i] - 48;
			}
			System.out.println(ans);
		}
	}
}