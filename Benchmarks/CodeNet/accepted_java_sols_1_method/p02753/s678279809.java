/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;


public class Main {
	public static void main (String[] args) {
// 		System.out.println("GfG!"); 
Scanner sc = new Scanner(System.in);
String s= sc.next();
int a=0;
int b= 0;
for(int i=0;i<3;i++){
    char ch = s.charAt(i);
    if(ch=='A')
    a++;
    else
    b++;
    
}
if(a!=0 && b!=0)
System.out.println("Yes");
else
System.out.println("No");

	}
}