package kakomon;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int a,b,c;
	   int sa[]= new int[7];
	   for(c=0;c<=6;c++){
	   a=sc.nextInt();
	   b=sc.nextInt();
	   sa[c]=a-b;
	   
	   }
		for(c=0;c<=6;c++){
			System.out.println(sa[c]);			
			
		}


	    }
	}