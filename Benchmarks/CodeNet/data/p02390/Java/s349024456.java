import java.util.*;
import java.io.*;
public class Watch {
	public static void main(String args[]){
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		int seconds=sc.nextInt();
		sc.close();
		int h=seconds/3600;
		int m=(seconds-h*3600)/60;
		int s=seconds-h*3600-m*60;
		System.out.println(h+":"+m+":"+s);
	}
}