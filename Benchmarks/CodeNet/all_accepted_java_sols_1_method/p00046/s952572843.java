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
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String brf;
		while ((brf=br.readLine()) != null){
		double max, min;
		max = min = Double.parseDouble(brf);
		while((brf = br.readLine())!=null){
			double newone = Double.parseDouble(brf);
			if(newone > max){max = newone;
			}
			if(newone < min){min = newone;}
		}
		System.out.println(max-min);
	}
		
	
	}
}