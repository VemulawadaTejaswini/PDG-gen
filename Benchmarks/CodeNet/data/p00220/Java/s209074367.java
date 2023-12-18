import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		double n;
		
		while((n = Double.parseDouble(string = reader.readLine())) != -1.0){
			string = "";
			if(n >= 128.0){
				n -= 128.0;
				string += 1;
			}else string += 0;
			if(n >= 64.0){
				n -= 64.0;
				string += 1;
			}else string += 0;
			if(n >= 32.0){
				n -= 32.0;
				string += 1;
			}else string += 0;
			if(n >= 16.0){
				n -= 16.0;
				string += 1;
			}else string += 0;
			if(n >= 8.0){
				n -= 8.0;
				string += 1;
			}else string += 0;
			if(n >= 4.0){
				n -= 4.0;
				string += 1;
			}else string += 0;
			if(n >= 2.0){
				n -= 2.0;
				string += 1;
			}else string += 0;
			if(n >= 1.0){
				n -= 1.0;
				string += 1;
			}else string += 0;
			if(n != 0.0) string += ".";
			if(n >= 0.5){
				n -= 0.5;
				string += 1;
			}else string += 0;
			if(n >= 0.25){
				n -= 0.25;
				string += 1;
			}else string += 0;
			if(n >= 0.125){
				n -= 0.125;
				string += 1;
			}else string += 0;
			if(n >= 0.0625){
				n -= 0.0625;
				string += 1;
			}else string += 0;
			if(n != 0.0) System.out.println("NA");
			else       System.out.println(string);
		}
		reader.close();
	}
}