import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String[] st;
	int c=0, t = sc.nextInt();
	st = new String[t];
	for(int i=0; i<t; i++)
	    st[i] = sc.next();
	Arrays.sort(st);
	System.out.println(st[0]);
    }
}