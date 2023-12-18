import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		String word=in.nextLine(),str = in.nextLine();
		while(true) {
			String tstr=in.nextLine();
			if(tstr.equals("END_OF_TEXT"))break;
			str+=tstr;
		}
		word=word.toUpperCase(); str=str.toUpperCase();
		//out.println(word+"::"+str);
		int cnt=0;
		int i=0;
		while(true) {
			i=str.indexOf(word, i);
			if(i==-1)break;
			cnt++;
			i++;
		}
		out.println(cnt);
		out.flush();
	}

}

