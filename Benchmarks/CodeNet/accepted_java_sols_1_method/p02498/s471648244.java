import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//String[] ia;
		//Scanner in = new Scanner(System.in);

		char[] tmp = in.readLine().toCharArray();
		for(int i = 0;i < tmp.length; ++i){
			if('a' <= tmp[i] && tmp[i] <= 'z'){
				System.out.print(((char) (tmp[i] + ('A'-'a'))));
			} else if('A' <= tmp[i] && tmp[i] <= 'Z'){
				System.out.print(((char) (tmp[i] + ('a'-'A'))));
			} else {
				System.out.print(tmp[i]);
			}
		}
		System.out.println();
	}
}