
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int answer = 0;
		int mawari = 0;
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int a = Integer.parseInt(s);
        String k = scan.next();
        int b = Integer.parseInt(k);      
        
        answer = a*b;
        mawari = a+a+b+b;
        System.out.print(answer + " ");
        System.out.println(mawari);
		
	}
}