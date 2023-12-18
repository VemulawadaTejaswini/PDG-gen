import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 1;
		while(sc.hasNext()){
			 int i = sc.nextInt();
			 if(i == 0){
				 break;
			 }
		
		System.out.println("Case" + " " + i + ":" + x);
		count++;
		}
		}
	}