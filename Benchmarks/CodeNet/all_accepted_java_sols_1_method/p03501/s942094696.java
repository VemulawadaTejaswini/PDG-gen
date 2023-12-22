import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Main extends Thread {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		System.out.println(Math.min(b, n * a));
	}

}