import java.io.*;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = br.readLine();
			String[] spl = line.split(" ");
			int m = Integer.parseInt(spl[0]);
			int f = Integer.parseInt(spl[1]);
			int r = Integer.parseInt(spl[2]);
			if ( m == -1  && f == -1 && r == -1) {break;}
			if ( m == -1) { m += 1;}
			if ( f == -1) { f += 1;}
			if ( n == -1) { n += 1;}
			if( m + f >= 80){
				System.out.println("A");
			}else if( m + f >= 65){
				System.out.println("B");
			}else if( m + f >= 50 || ( m + f >=30) && r >= 50){
				System.out.println("C");
			}else if( m + f >= 30){
				System.out.println("D");
			}else{
				System.out.println("F");
			}
		}
	}
}