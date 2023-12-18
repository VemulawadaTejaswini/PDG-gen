import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = A + B;
		int hiku = A - B;
		int kakeru = A * B;
		int a = Math.max(sum,hiku);
		System.out.println(Math.max(a,kakeru));
	}
}