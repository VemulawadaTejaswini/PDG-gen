import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) throws IOException {



		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String change = sc.readLine();
		StringBuilder sb = new StringBuilder();



		for(int i = 0; i < change.length(); i++)
		{
			if(Character.isUpperCase(change.charAt(i)))
			{
				sb.append(Character.toLowerCase(change.charAt(i)));

			}else if(Character.isLowerCase(change.charAt(i)))
			{
				sb.append(Character.toUpperCase(change.charAt(i)));

			}else{
				sb.append(change.charAt(i));
			}
		}
		System.out.println(sb);
	}

}