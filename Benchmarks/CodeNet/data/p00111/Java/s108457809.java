import java.util.*;
import java.util.Map.Entry;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	void run(){
		sc=new Scanner(System.in);

		HashMap<String, String> map1=new HashMap<String, String>();
		map1.put("A", "00000");
		map1.put("B", "00001");
		map1.put("C", "00010");
		map1.put("D", "00011");
		map1.put("E", "00100");
		map1.put("F", "00101");
		map1.put("G", "00110");
		map1.put("H", "00111");
		map1.put("I", "01000");
		map1.put("J", "01001");
		map1.put("K", "01010");
		map1.put("L", "01011");
		map1.put("M", "01100");
		map1.put("N", "01101");
		map1.put("O", "01110");
		map1.put("P", "01111");
		map1.put("Q", "10000");
		map1.put("R", "10001");
		map1.put("S", "10010");
		map1.put("T", "10011");
		map1.put("U", "10100");
		map1.put("V", "10101");
		map1.put("W", "10110");
		map1.put("X", "10111");
		map1.put("Y", "11000");
		map1.put("Z", "11001");
		map1.put(" ", "11010");
		map1.put(".", "11011");
		map1.put(",", "11100");
		map1.put("-", "11101");
		map1.put("'", "11110");
		map1.put("?", "11111");

		HashMap<String, String> map2=new HashMap<String, String>();
		map2.put("101", " ");
		map2.put("000000", "'");
		map2.put("000011", ",");
		map2.put("10010001", "-");
		map2.put("010001", ".");
		map2.put("000001", "?");
		map2.put("100101", "A");
		map2.put("10011010", "N");
		map2.put("0101", "C");
		map2.put("0001", "D");
		map2.put("110", "E");
		map2.put("01001", "F");
		map2.put("10011011", "G");
		map2.put("010000", "H");
		map2.put("0111", "I");
		map2.put("10011000", "J");
		map2.put("0110", "K");
		map2.put("00100", "L");
		map2.put("10011001", "M");
		map2.put("10011110", "N");
		map2.put("00101", "O");
		map2.put("111", "P");
		map2.put("10011111", "Q");
		map2.put("1000", "R");
		map2.put("00110", "S");
		map2.put("00111", "T");
		map2.put("10011100", "U");
		map2.put("10011101", "V");
		map2.put("000010", "W");
		map2.put("10010010", "X");
		map2.put("10010011", "Y");
		map2.put("10010000", "Z");

		for(; sc.hasNextLine();){
			String s=sc.nextLine();
			String t="";
			for(char c : s.toCharArray())
				t+=map1.get(c+"");
//			println(t);
			for(;;){
				boolean f=false;
				for(Entry<String, String> entry : map2.entrySet()){
					if(t.matches("\\D*"+entry.getKey()+"\\d*")){
						t=t.replaceFirst(entry.getKey(), entry.getValue());
//						println(t);
						f=true;
						break;
					}
				}
				if(!f)
					break;
			}
			t=t.replaceAll("\\d", "");
			println(t);
			// t.matches(regex)
		}
		sc.close();
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}