import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			for (int i=n-1; i>1; i--)
				n *= i;
			System.out.println(n);
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		} 
	}
}