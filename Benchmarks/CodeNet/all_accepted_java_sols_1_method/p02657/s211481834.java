import java.io.*;
import java.util.*;


class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int n=Integer.parseInt(s[0].trim());
		int m=Integer.parseInt(s[1].trim());
		int res=n*m;
		System.out.println(res);
		
	}

}
