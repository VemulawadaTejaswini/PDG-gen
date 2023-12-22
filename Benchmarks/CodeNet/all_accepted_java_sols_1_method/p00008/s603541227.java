/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	static final Scanner stdin = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		while(stdin.hasNext()){
			int n = stdin.nextInt();
			int sum = 0;
			int count = 0;
			for(int a = 0;a < 10;a++){//a
				for(int b = 0;b < 10;b++){//b
					for(int c = 0;c < 10;c++){//c
						for(int d = 0;d < 10;d++){//d
							sum = a + b + c + d;
							if(sum == n){
								count +=1;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}