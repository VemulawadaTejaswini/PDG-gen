import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt(), n=sc.nextInt();
		String s1="", s2="";
		for(int i=0;i<m;i++)s1+=n;
		for(int i=0;i<n;i++)s2+=m;
		System.out.println(s1.compareTo(s2)<0?s1:s2);
	}
 
}