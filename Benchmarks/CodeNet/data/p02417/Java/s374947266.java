/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Map<Character, Integer> map = new TreeMap<Character, Integer>();

		for (char c = 'a'; c <= 'z'; c++) {
			map.put(c, 0);
		}

		BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String line = "";
	    while ((line = br.readLine()) != null) {
			for (int i = 0; i < line.length(); i++) {
				char c = line.toLowerCase().charAt(i);
				if (map.containsKey(c)) {
	 				map.put(c, map.get(c) + 1);
				}
			}	    	
	    }

		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}