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
		int 
		x1=Integer.parseInt(str[0]),
		y1=Integer.parseInt(str[1]),
		x2=Integer.parseInt(str[2]),
		y2=Integer.parseInt(str[3]);
		double a=Math.pow((x1-x2),2)+(y1-y2)*(y1-y2);
		double dis=Math.sqrt(a);
		
		
		
		System.out.printf("%1$.5f%n",dis);
	
	
	}}