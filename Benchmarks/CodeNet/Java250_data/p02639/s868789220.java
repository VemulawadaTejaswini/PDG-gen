import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main(String[] args)throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[5],p=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<5; i++) {
			a[i]=Integer.parseInt(st.nextToken());
			if(a[i]==0) p=i+1;
		}
		System.out.println(p);
	}

}
