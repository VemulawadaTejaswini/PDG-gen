import java.io.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine();
		Scanner sc=new Scanner(str);
		System.out.println((sc.nextInt())*(sc.nextInt()));
		sc.close();
		
		
	
		
	}
}