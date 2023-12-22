/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
        Scanner input=new Scanner(System.in);
       char[] array=new char[26];
       array[0]='z';
       for(int i=1;i<26;i++)
            array[i]=(char)(i+96);
        /*for(int i=0;i<26;i++)
            System.out.print(array[i] + " ");*/
        long n=input.nextLong();
        List<Integer> list=new ArrayList<Integer>();
        while(n>0)
        {
            long x=n%26;
            list.add((int)x);
            if(x==0)
                n=n-26;
            n=n/26;
        }
        // System.out.println(list);
        int size=list.size();
        for(int i=size-1;i>=0;i--)
        {
            int x=list.get(i);
            System.out.print(array[x]);
        }
       input.close();
	}
}