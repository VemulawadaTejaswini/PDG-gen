import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner scan=new Scanner(System.in);
//int a=scan.nextInt();

//int b=scan.nextInt();
String b=scan.next();
int rong=b.length();
StringBuffer sb = new StringBuffer(b);
String dst = sb.reverse().toString();
if(rong<=2) {System.out.println(b);}
else {System.out.println(""+dst);}
	}
}
