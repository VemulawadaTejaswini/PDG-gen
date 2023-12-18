import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		while(x != 0){
			 x = sc.nextInt();
		}
		
		if(x == 0){
			for(int i = 1;i < x;i++){
				System.out.println("case"+ " " + i + ":" + " " + x);	
			}
		}
	}
}