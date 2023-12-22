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
		int week = scan.nextInt();
		int moto = 100000;
		int totaldebt = 100000;
		for(int i = 0; i < week;i++){
		int rishi = (int) ((int) totaldebt * 0.05);
		totaldebt = totaldebt + rishi;
		if(totaldebt % 1000 != 0){
			totaldebt = totaldebt - (totaldebt%1000) +1000;
		}
		}
		System.out.println(totaldebt);
	}
}