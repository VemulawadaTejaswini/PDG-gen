import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {

		 BufferedReader br = new BufferedReader(new
		 InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		
		String[] str=br.readLine().split(" ");
		double x1=Double.parseDouble(str[0]);
		double y1=Double.parseDouble(str[1]);
		double x2=Double.parseDouble(str[2]);
		double y2=Double.parseDouble(str[3]);
		double a=Math.pow((x1-x2),2)+(y1-y2)*(y1-y2);
		double dis=Math.sqrt(a);		
		System.out.printf("%1$.5f%n",dis);
	
	
	}}