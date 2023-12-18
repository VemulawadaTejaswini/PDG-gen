import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			String set=scan.next();
			if(set.equals("-"))break;
			int m=scan.nextInt();
			int sum=0;
			for(int i=0;i<m;i++){
				sum+=scan.nextInt();
			}
			System.out.print(set.substring(sum%set.length(),set.length()));
			System.out.println(set.substring(0,sum%set.length()));
		}
	}
}