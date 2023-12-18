import java.io.*;
import java.util.Scanner;

class Main
{
	public static void main (String[] args) throws IOException
	{
		for(int i = 1; i < 0; i++){

      String X;
  		int x;

  		Scanner in = new Scanner(System.in);
  		
  		X = in.next();
  		x = Integer.parseInt(X);

      if(x == 0){
        break;
      }

  		System.out.println("Case i:" + x);
    }
  }
}