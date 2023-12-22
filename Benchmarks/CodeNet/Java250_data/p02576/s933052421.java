import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken()),t=Integer.parseInt(st.nextToken());
		System.out.println( (int)Math.ceil((n/(float)x))*t);
	}

}