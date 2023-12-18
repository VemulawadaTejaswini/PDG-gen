import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=in.nextInt(),taro=0,hanako=0;
		
		for(int i=0;i<n;i++) {
			String str1=in.next(),str2=in.next();
			if(str1.compareTo(str2)>0)taro+=3;
			else if(str1.compareTo(str2)<0)hanako+=3;
			else {
				taro++; hanako++;
			}
		}
		out.println(taro+" "+hanako);
		out.flush();
	}

}

