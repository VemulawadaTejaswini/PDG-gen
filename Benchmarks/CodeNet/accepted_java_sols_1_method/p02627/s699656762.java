import java.math.*;
import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String a = scn.next();
		if((int)a.charAt(0)>96) {
			System.out.println('a');
		}else {
			System.out.println('A');
		}
	}
}	