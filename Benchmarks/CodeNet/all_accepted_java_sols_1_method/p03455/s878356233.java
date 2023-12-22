import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
      	int a = Integer.parseInt(sc.next());
      	int b = Integer.parseInt(sc.next());
      	if ((a * b) % 2 == 0) { System.out.println("Even"); }
      	else { System.out.println("Odd"); }
    }
}