import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String in = stdIn.nextLine();
		
		in = in.replaceAll("apple", "AAAAA");
		in = in.replaceAll("peach", "apple");
		in = in.replaceAll("AAAAA", "peach");
		System.out.println(in);
	}
}