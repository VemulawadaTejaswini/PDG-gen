
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int x;
		
		try{
			do{
				x = System.in.read();
				if(Character.isLowerCase((char)x))
				{
					System.out.print(Character.toUpperCase((char)x));
				}
				else
				{
					System.out.print(Character.toLowerCase((char)x));
				}
			}while((char)x!='\n');
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}