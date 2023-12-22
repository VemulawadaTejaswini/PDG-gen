import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
	int a, b, m = 0, l = 0;

//	try{
		Scanner scan = new Scanner(System.in);
		
		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		
		if(a >= 1 || b<= 100){
			m = a * b;
			l = (a + b) * 2;
		}else{
			//a = null;
			//b = null;
		}
		
		System.out.println(m + " " + l);

//	}catch(IOException e){
	
//	}


	}

}