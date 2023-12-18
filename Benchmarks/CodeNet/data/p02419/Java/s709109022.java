/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
public static void main (String[] args) throws java.lang.Exception
{
	Scanner scan = new Scanner(System.in);
	int count = 0;
	
	BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));

	String w = "";
    String line = "";
    while ((line = br.readLine()) != null) {
		if (w.isEmpty()) {
			w = line.toLowerCase();
			continue;
		}

		if ("END_OF_TEXT".equals(line)) {
			break;
		}

		String[] words = line.split(" ");
		for (int i = 0; i < words.length; i++) {
		if (w.equals(words[i].toLowerCase())) {
				count++;
			}
		}	    	
    }

	System.out.println(count);
}
}