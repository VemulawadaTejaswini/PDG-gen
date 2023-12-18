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
		int time = scan.nextInt();
		for(int i = 0;i < time+1;i++){
			String input = scan.nextLine();
			input = input.replaceAll("Hoshino","Hoshina");
			System.out.println(input);
		}
	}
}