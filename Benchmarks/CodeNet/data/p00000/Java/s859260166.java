/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int j = 1;
		int i = 1;

		for(int count = 1; count < 10; count++){
			System.out.println(i +"×" +  j + "=" + i * j);
			j++;
			if( j == 10){
				i++;
				j = 1;
				count = 0;
				if(i == 10){
					count = 10;
				}
			}
		}
	}
}