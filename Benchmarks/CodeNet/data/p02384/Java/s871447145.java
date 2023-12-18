import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] arsg) throws IOException{
		Scanner scan = new Scanner(System.in);
		
		int[] x = new int[6];
		
		for(int i = 0;i<6;i++){
			x[i] = scan.nextInt();
		}
		int y = scan.nextInt();
		
		for(int i = 0;i<y;i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(b==x[1]&&a==x[0]||
			   b==x[0]&&a==x[4]||
			   b==x[4]&&a==x[5]||
			   b==x[5]&&a==x[1]){
			   	System.out.println(x[2]);
			}
			else if(b==x[0]&&a==x[2]||
			        b==x[3]&&a==x[0]||
			        b==x[5]&&a==x[3]||
			         b==x[2]&&a==x[5]){
			   	System.out.println(x[1]);
			}			
			else if(b==x[1]&&a==x[3]||
			        b==x[3]&&a==x[4]||
			        b==x[4]&&a==x[3]||
			        b==x[2]&&a==x[1]){
			   	System.out.println(x[0]);
			}
			else if(b==x[0]&&a==x[1]||
			        b==x[1]&&a==x[5]||
			        b==x[5]&&a==x[4]||
			        b==x[4]&&a==x[0]){
			   	System.out.println(x[3]);
			}				
			else if(b==x[0]&&a==x[3]||
			        b==x[2]&&a==x[0]||
			        b==x[5]&&a==x[2]||
			        b==x[3]&&a==x[5]){
			   	System.out.println(x[4]);
			}			
			else if(b==x[1]&&a==x[2]||
			        b==x[2]&&a==x[4]||
			        b==x[4]&&a==x[3]||
			        b==x[3]&&a==x[1]){
			   	System.out.println(x[5]);
			}					
		}
	}
}
						