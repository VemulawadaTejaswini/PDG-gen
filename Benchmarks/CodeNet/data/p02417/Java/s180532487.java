import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0; i < 26; i++) {
			map.put((char)('a'+i), 0);
		}
		while(sc.hasNextLine()) {
			char[] a = sc.nextLine().toCharArray();
			
			for(int i = 0; i < a.length; i++) {
				if(map.containsKey(Character.toLowerCase(a[i]))) {
					map.put(Character.toLowerCase(a[i]), map.get(Character.toLowerCase(a[i]))+1);
				}
			}
		}
		for(int i = 0; i < 26; i++) {
			System.out.println((char)('a'+i) + " : " + map.get((char)('a' + i)));
		}
	}
}