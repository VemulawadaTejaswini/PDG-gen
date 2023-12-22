import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		System.out.println(n%1000==0?0:1000-n%1000);
	}

}
