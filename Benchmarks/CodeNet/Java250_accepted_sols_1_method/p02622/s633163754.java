import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		String s=sc.nextLine(),t=sc.nextLine();

		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=t.charAt(i))num++;
		}
		System.out.print(num);
		sc.close();
	}
}
