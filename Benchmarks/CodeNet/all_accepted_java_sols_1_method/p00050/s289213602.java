//import java.util.Scanner;
import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		//Scanner scan = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String a = br.readLine();
		a = a.replaceAll("apple","1");
		a = a.replaceAll("peach","2");
		a = a.replaceAll("1","peach");
		a = a.replaceAll("2","apple");
		System.out.println(a);
	}
}