import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
				
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(input);
		
	    while(true){
	    	int a=sc.nextInt();
	    	int b=sc.nextInt();
	    	if(a==0&&b==0){sc.close();break;}
	    	else if(a<b)System.out.println(a+" "+b);
	    	else System.out.println(b+" "+a);
	    	}
	    }
	     	
	}