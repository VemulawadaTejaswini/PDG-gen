import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		if(N%1000==0)
			System.out.println(0);
		else
			System.out.println(1000-(N%1000));
	}
}
