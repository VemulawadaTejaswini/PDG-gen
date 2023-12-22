import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		//String inputString=br.readLine();
		//int a = Integer.parseInt ( inputString );
		//int b = Integer.parseInt ( inputString );
		
		//Scanner sc= new Scanner(System.in);
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		if((a*b)%2==0)
			System.out.println("Even");
		else System.out.println("Odd");
	
	}

}