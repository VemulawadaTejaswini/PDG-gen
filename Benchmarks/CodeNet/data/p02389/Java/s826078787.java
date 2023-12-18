import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

	/*	String S = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			S = br.readLine();
			br.close();
		} catch (IOException e) {

		}
		int s = Integer.parseInt(S);
		int s2 = s % 60;
		int h = s / 3600;
		int m = s % 3600 / 60;
		System.out.println(h + ":" + m + ":" + s2);
		/*
		 
	/
	

/*
S = 60 * 60 * h + 60 * m + s

String S = null
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			S = br.readLine();
			br.close();
		} catch (IOException e) {
System.out.println(h + ":" + m + ":" + s);

SはコンソールにするからSystem.out.printlnとString　＝null
で表す

S=3600s
h=s/3600
m=s%3600/60

int s = Integer.parseInt(S)
int h = s/3600
int m = s%3600/m
*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = br.readLine();
			br.close();
		} catch (IOException e) {
		}

		String [] ab = input.split(" ");

		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		
		/*
		 System.out.println((a + b) * 2);/
		System.out.println(a * b);
		
		*/
		 
		System.out.println(a * b + " " + (a + b) * 2);
		

	}
}

