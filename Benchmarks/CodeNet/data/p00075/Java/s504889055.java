import java.io.*;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


class Main {
	public static void main(String[] a) throws IOException {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String inputs = scan.nextLine();
			String[] datas = inputs.split(",",0);
			int stuid = new Integer(datas[0]).intValue();
			double weight = (Double.parseDouble(datas[1]));
			double height = (Double.parseDouble(datas[2]));
			
			double bmi = weight / (height * height);
			
			if(bmi >= 25.0){
				System.out.println(stuid);
			}
	}
 }
}