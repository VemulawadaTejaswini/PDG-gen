import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int area=1;
		int length=0;
		int num = scan.nextInt();
		System.out.println(num/3600+":"+num%3600/60+":"+num%60);
	}
}