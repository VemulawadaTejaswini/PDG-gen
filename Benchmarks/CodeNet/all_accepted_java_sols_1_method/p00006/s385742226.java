
import java.io.*;
import java.util.*;

public class Main { //REMEMBER TO USE MAIN//
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));//
		String line;
		while((line=in.readLine())!=null){//
			String s = "";
			for (int i=line.length()-1;i>-1;i--){
				s+= line.charAt(i);
			}
			System.out.println(s);
			////Some code
		}//while#1
	}//static main
}//class