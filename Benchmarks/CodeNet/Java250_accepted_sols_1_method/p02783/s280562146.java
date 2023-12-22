
  
  /*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int h,a;
        h=sc.nextInt();
        a=sc.nextInt();
        int y=h/a;
        if(y*a==h)
        {
            System.out.println(y);
        }else
        {
            System.out.println(y+1);
        }
        
        
	}
}