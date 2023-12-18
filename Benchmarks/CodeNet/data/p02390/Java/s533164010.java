import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

class Main
{
 public static void main(String[] args) throws IOException
 {
	 Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 
 int h = n/3600;
 int m = n%3600/60;
 int s = n%60;
 
 System.out.println(h+":"+m+":"+s);
 }
}