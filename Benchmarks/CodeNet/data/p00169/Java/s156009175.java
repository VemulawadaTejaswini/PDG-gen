import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

      public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
	String line;
	while(true)
	    {
		line = in.readLine();
		String[] elements = line.split(" ");
		int[] cards = new int[elements.length+1];

		if(elements[0].equals("0") && elements.length == 1)
		break;

		int one_counter = 0;		
		int sum = 0;


		for(int i=0;i<elements.length;i++)
		    {
			cards[i] = Integer.parseInt(elements[i]);
			if(cards[i] == 1)
			    {
				one_counter++;
			    }
			if(cards[i] <= 9)
			    sum += cards[i];
			else 
			    sum += 10;
		    }

		if(sum > 21)
		    {
			System.out.println(0);
			continue;
		    }
		else
		    {
			if(one_counter == 0)
			    {
				System.out.println(sum);
			    }
			else 
			    {
				while(one_counter>0 && sum-1+11 <= 21)
				    {
					one_counter--;
					sum--;
					sum += 11;
				    }
				System.out.println(sum);
			    }
		    }
	    }
    }
    
}