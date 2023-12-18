import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\D+");
		
		while (scan.hasNext()) {
			int d = scan.nextInt();
			
			int area=0;
			for(int i=0;i<600/d;i++){
				area += (i*d)*(i*d);
			}
			System.out.println(area*d);
		}
		scan.close();
	}
}