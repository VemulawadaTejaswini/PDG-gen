import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		for(int i = 0;i<length;i++){
			String[] num = br.readLine().split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			int c = Integer.parseInt(num[2]);
			
			int rightc = a*a+b*b;
			if(c*c==rightc){
				System.out.println("YES");
			} else{
				System.out.println("NO");
			}
		}
	}
}
			