

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		// 1 : str[0]
		// 2 : order count Q
		// 3~ Last : order
		//
		// Order condition
		// 1) Print ab : a~b syso
		// 2) Reverse ab: a~b Reverse
		// 3) Replace ab : a~b P(str or char) Switch

		// Sample Input 1
		// abcde
		// 3
		// replace 1 3 xyz
		// reverse 0 2
		// print 1 4
		// Sample Output 1
		// xaze
		// Sample Input 2
		// xyz
		// 3
		// print 0 2
		// replace 0 2 abc
		// print 0 2
		// Sample Output 2
		// xyz
		// abc

		Scanner sc = new Scanner(System.in);

		// declear variable
		int min=0, max=0;
		String result = "";
		String tmpStr="";

		// str input
		String str = sc.nextLine();
		// ordercount input
		int orderCntQ = sc.nextInt();

		for (int i = 0; i < orderCntQ; i++) {
			String order = sc.next();
			min = Integer.parseInt(sc.next());
			max = Integer.parseInt(sc.next());

			switch (order) {
			case "replace":
				//replace()
				tmpStr = sc.next();
				result+=Order1(str, result, order, min, max, tmpStr);// clear
				//test
				System.out.println(result);
				break;
			case "reverse":
				// substring()
				result+=Order2(str, result, order, min, max); // error : array bounds -2
				//test
				System.out.println(result);
				break;
			case "print":
				// charAt()
				Order3(str, result, order, min, max);
				//test
				System.out.println(result);
				break;

			}
		}

	}

	static String Order1(String str, String result, String order, int min, int max, String tmpStr) {//clear
		//replace()
		str = str.replace(str.substring(min,max), tmpStr);
		result = str;
		return result;
	}

	static String Order2(String str, String result, String order, int min, int max) {
		// case "reverse":
		// substring()

		// str = str.replace(str.substring(min,max), str); //test point
		// str = str.substring(min)+str.substring(max,min);//error point
		// result = str;
		// test
		// System.out.println(result);
		String target="";
	    String before="";
	    String after="";
	for(int i=0;i<min;i++){
	        before = before + str.charAt(i);
	    }

	    for(int i=min;i<=max;i++){
	        target = str.charAt(i) + target;
	    }

	    for(int i=min+1;i<str.length();i++){
	        after = after + str.charAt(i);
	    }

	    str = before+ target + after;
	    result = str;
		return result;

	}
	static void Order3(String str, String result, String order, int min, int max) {

		//case "print":
		// charAt()
		for (int i = min; i <= max; i++)
			result += str.charAt(i);

		System.out.println(result);

	}
}