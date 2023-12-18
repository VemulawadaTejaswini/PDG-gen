import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	int t, a=0, b=0;
	Scanner sc = new Scanner(System.in);
	String sr, st;
	t = sc.nextInt();
	for(int i=0; i<t; i++){
	    sr = sc.next();
	    st = sc.next();
	    if(sr.compareTo(st)>0)
		a+=3;
	    else if(sr.compareTo(st)==0){
		a++; b++;
	    }
	    else
		b+=3;
	}
	System.out.println(a+" "+b);
    }
}