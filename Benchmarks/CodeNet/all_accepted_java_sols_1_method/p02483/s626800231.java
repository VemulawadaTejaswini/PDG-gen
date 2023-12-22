import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new java.util.Scanner(System.in);
		String s1 = sc.nextLine();
		String[] s2 = s1.split("[\\s]+");
		Integer a = new Integer(s2[0]);
		Integer b = new Integer(s2[1]);
		Integer c = new Integer(s2[2]);
		
		int[] x = {a,b,c};
		Arrays.sort(x);
		System.out.println(x[0]+" "+x[1]+" "+x[2]);
	}
}