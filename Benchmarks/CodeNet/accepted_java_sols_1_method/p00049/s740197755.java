import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int AB = 0;
		int O = 0;
		while(stdIn.hasNext()) {
			String[] a = stdIn.next().split(",");
			if(a[1].equals("A")) {
				A++;
			}
			if(a[1].equals("B")) {
				B++;
			}
			if(a[1].equals("AB")) {
				AB++;
			}
			if(a[1].equals("O")) {
				O++;
			}
		}
		System.out.println(A+"\n"+B+"\n"+AB+"\n"+O);
	}
}