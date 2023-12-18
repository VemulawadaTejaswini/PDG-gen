import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import org.omg.CORBA.SystemException;

class Main {
	public static void main(String[] a) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (true){
		int m = scan.nextInt();
		int d = scan.nextInt();
		if(m == 0){
			break;
		}
		int y = 2014;
	   if(m<3){
		   y = y-1;
		   m = m + 12;
	   }
		int youbi = (y + y/4 - y/100 + y/400 + (26*m+16)/10 + d) % 7;
		if(youbi == 0){
			System.out.println("Monday");
		}else if(youbi == 1){
			System.out.println("Tuesday");
		}else if(youbi == 2){
			System.out.println("Wednesday");
		}else if (youbi == 3){
			System.out.println("Thursday");
		}else if (youbi == 4){
			System.out.println("Friday");
		}else if (youbi == 5){
			System.out.println("Saturday");
		}
		else if (youbi == 6){
			System.out.println("Sunday");
		}
	}
	}
}