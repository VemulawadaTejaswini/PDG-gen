import java.util.*;
import java.io.*;

class Main{
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
for(;;){
	int x =sc.nextInt();
	int h =sc.nextInt();
	if(x==0) break;
	
	double ok = x*x+x*Math.sqrt(x*x+h*h*4.0);
	System.out.println(ok);
}
	}
	}