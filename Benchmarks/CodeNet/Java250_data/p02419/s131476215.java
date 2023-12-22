import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Main{
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileReader("sample.txt"));
						
		String x=sc.next();
		
		String str;
		int count=0;
		for(;!((str=sc.next()).equals("END_OF_TEXT"));){
			
			if((str.equalsIgnoreCase(x)))count++;
			}sc.close();
			
			System.out.println(count);
		}
		
		}