import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x =Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
		System.out.println(y%2==0 && y>=2*x && y<=4*x? "Yes":"No" );
	}
}