import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<String> strList2 = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	static HashMap<String,Integer> Hmap = new HashMap<String,Integer>();
	public static void main(String[] args) {


		String strArray[] = sc.next().split("");
		int a = 0;
		for(String s : strArray) {
			if(s.equals("R")) {
				a++;
			}
		}
		System.out.println(a);
	}
}
