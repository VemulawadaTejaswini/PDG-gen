import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			long n = sc.nextLong();
			if(n == 0) break;
			int count = 0;
			for(;;){
				count += n / 5;
				n = n / 5;
				if(n == 0) break;
			}
			System.out.println(count);
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}