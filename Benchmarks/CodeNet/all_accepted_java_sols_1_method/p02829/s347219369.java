

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		 int n =Integer.valueOf(br.readLine());
	     int z =Integer.valueOf(br.readLine());
		 
		 if(n==1) {
			 if(z==2) {
				 System.out.print("3");
			 }
			 else if(z==3) {
				 System.out.print("2");
			 }
		 }else if(n==2) {
			 if(z==1) {
				 System.out.print("3");
			 }
			 else if(z==3) {
				 System.out.print("1");
			 }
		 }else if(n==3) {
			 if(z==1) {
				 System.out.print("2");
			 }
			 else if(z==2) {
				 System.out.print("1");
			 }
		 }
	}

}
