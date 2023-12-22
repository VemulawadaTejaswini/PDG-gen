/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
		String First = "";
		
		while(sc.hasNext()){
			if(First==""){
				First = sc.nextLine();
			}else{
				String str = sc.nextLine();
				
				str = str.replaceAll("Hoshino", "Hoshina");
				System.out.println(str);
			}
		}
	}
}