    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    class Main
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		Scanner io = new Scanner(System.in);
    		int n = io.nextInt();
    		String a = io.next(), b = io.next();
    		for(int i = 0; i < n; i++)
    			System.out.print(""+a.charAt(i)+b.charAt(i));
    		System.out.println();
    	}
    }