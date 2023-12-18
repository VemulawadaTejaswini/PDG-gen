import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		try{	
			int a = sc.nextInt();

    		System.out.printf("%d:%d:%d\n", a/3600, (a/60)%60, a%60 );
		}
		catch(Exception e){}
    }
}

