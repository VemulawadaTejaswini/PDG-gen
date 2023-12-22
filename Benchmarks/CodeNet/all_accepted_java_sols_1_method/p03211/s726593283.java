import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
 {
	public static void main (String[] args)
	 {
            Scanner sc=new Scanner(System.in);
            String s=sc.next(),str="";char ch[]=s.toCharArray();
            int i,j,n=s.length(),min=1000000;
            for(i=0;(i+2)<n;i++) {
            	char ch1=ch[i],ch2=ch[i+1],ch3=ch[i+2];
            	int num=(ch1-'0')*100+(ch2-'0')*10+(ch3-'0');
            	int diff=Math.abs(num-753);
            	min=Math.min(diff,min);
            }
            System.out.println(min);
	 }
}