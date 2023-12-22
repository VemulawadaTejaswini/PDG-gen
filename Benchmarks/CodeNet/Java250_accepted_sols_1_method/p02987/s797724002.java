import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String a = s.substring(0,1);
	String b = s.substring(1,2);
	String c = s.substring(2,3);
	String d = s.substring(3,4);
	if((a.equals(b) && !(a.equals(c)) && c.equals(d)) || (a.equals(c) && !(a.equals(b)) && b.equals(d)) ||(a.equals(d) && !(a.equals(b)) && b.equals(c))){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
	
}
}
