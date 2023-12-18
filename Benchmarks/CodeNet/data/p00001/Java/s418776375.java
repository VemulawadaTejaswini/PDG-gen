import java.io.IOException;
import java.io.*;

public class Main {
	
	public static int[] source = new int[10];	
	static int b1 = 0;
	static int b2 = 0;
	static int b3 = 0;
	
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (int i=0; i<10; i++){
			source[i] = Integer.parseInt(in.readLine());
		}
		sort();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
		
	public static void sort(){
		for(int i=0; i<10; i++){
			if(b1 < source[i]){
				b3 = b2;
				b2 = b1;
				b1 = source[i];
			}else if(b2 < source[i]){
				b3 = b2;
				b2 = source[i];
			}else if(b3 < source[i]){
				b3 = source[i];
			}
		}
	}
	
}