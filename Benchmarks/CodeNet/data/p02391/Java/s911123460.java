import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String kazu=br.readLine();
		Scanner sc=new Scanner(kazu);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)System.out.println("a > b");
		else if(a<b)System.out.println("a < b");
		else System.out.println("a = b");
		sc.close();

	}

}