import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Main{
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		
				
		String x=sc.next();
		System.out.print(x);
		String str;
		int count=0;
		for(;!((str=sc.next()).equalsIgnoreCase("END_OF_TEXT"));){
			
			if((str.equals(x)))count++;
			}sc.close();
			
			System.out.println(count);
		}
		
		}