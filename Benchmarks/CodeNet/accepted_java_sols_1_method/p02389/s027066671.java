import java.io.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		Scanner sc=new Scanner(str);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a*b+" "+(a+b)*2);
		sc.close();
		
		
	
		
	}
}