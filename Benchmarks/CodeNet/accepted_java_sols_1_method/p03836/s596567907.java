/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sx = Integer.parseInt(sc.next());
		int sy = Integer.parseInt(sc.next());
		int tx = Integer.parseInt(sc.next());
		int ty = Integer.parseInt(sc.next());
		
		String route = "";
		
		for(int i = 0; i < ty - sy; i++) route += "U";
		for(int i = 0; i < tx - sx; i++) route += "R";
		
		for(int i = 0; i < ty - sy; i++) route += "D";
		for(int i = 0; i < tx - sx; i++) route += "L";
		
		route += "L";
		for(int i = 0; i <= ty - sy; i++) route += "U";
		for(int i = 0; i <= tx - sx; i++) route += "R";
		route += "D";
		
		route += "R";
		for(int i = 0; i <= ty - sy; i++) route += "D";
		for(int i = 0; i <= tx - sx; i++) route += "L";
		route += "U";
		
		System.out.println(route);
	}
}