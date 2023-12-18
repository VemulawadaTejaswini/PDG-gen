import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main
{

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		if(Character.isUpperCase(s)){
			System.out.println("A");
		}
		else{
			System.out.println("a");
		}
	}
}