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
			if(a==2&&b==1||
			   a==1&&b==5||
			   a==5&&b==6||
			   a==6&&b==2){
			   	System.out.println(x[2]);
			}
			else if(a==1&&b==3||
			        a==4&&b==1||
			        a==6&&b==4||
			         a==3&&b==6){
			   	System.out.println(x[1]);
			}			
			else if(a==2&&b==4||
			        a==4&&b==5||
			        a==5&&b==3||
			        a==3&&b==2){
			   	System.out.println(x[0]);
			}
			else if(a==1&&b==2||
			        a==2&&b==6||
			        a==6&&b==5||
			        a==5&&b==1){
			   	System.out.println(x[3]);
			}				
			else if(a==1&&b==4||
			        a==3&&b==6||
			        a==6&&b==3||
			        a==4&&b==1){
			   	System.out.println(x[4]);
			}			
			else if(a==2&&b==3||
			        a==3&&b==5||
			        a==5&&b==4||
			        a==4&&b==2){
			   	System.out.println(x[5]);
			}					
		}
	}
}
			