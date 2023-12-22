import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s=scan.next().toLowerCase();
		ArrayList<String> list=new ArrayList<String>();
		while(true){
			String ss=scan.next();
			if(ss.equals("END_OF_TEXT"))
				break;
			list.add(ss.toLowerCase());
		}
		int x=Collections.frequency(list, s);
		System.out.println(x);
	}
	

}