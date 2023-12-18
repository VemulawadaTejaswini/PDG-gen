
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

		for(int i=0;i<3;i++) {
			String a = strArray[i];
			strList.add(a);
		}


		int flag=0;
		int x=0;

		int i = 0;
		for(String a : strList) {
			if(i==1 && a.equals("S")) {
				flag=1;
			}
			i++;
		}

		for(String a : strList) {
			if(a.equals("R")) {
				x++;
			}
		}
		if(flag==1) {
			System.out.println(1);
		}
		else {
			System.out.println(x);
		}
	}

}


