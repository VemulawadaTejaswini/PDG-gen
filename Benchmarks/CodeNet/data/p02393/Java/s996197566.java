import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ary = br.readLine().split(" ");
		Arrays.sort(ary);
    	System.out.println(ary[0]+" "+ary[1]+" "+ary[2]);
    }
}