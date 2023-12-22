import java.awt.TexturePaint;
import java.awt.event.ComponentAdapter;
import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double first = Double.parseDouble(sc.next()); 
		double second = Double.parseDouble(sc.next());
		double third = Double.parseDouble(sc.next()); 
		double force = Double.parseDouble(sc.next());
		System.out.print(String.format("%.6f", (first*second/2)));
		System.out.print(" ");
		int flg = 0;
		if(third==(first/2) && force==(second/2)) {
			flg = 1;
		}
		System.out.println(flg);
	}
}