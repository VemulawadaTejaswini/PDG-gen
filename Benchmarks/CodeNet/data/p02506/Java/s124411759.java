import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringBuffer ss=new StringBuffer();
		while(true){
			String m=br.readLine();
			if(m.equalsIgnoreCase("END_OF_TEXT"))
				break;
			else{
				ss.append(m+"\n");
			}
		}
		String[] mm=ss.toString().split(" ");
		int c=0;
		for (int j = 0; j < mm.length; j++) {
			if(mm[j].equalsIgnoreCase(s))
				c++;
		}
		System.out.println(c);

	}

}