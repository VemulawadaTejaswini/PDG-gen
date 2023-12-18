import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] let = str.toCharArray();
		for (int i = 0 ; i<let.length ; i ++ ) {
			if (Character.isUpperCase(let[i])) {
				let[i] = Character.toLowerCase(let[i]);
			}else{
				let[i] = Character.toUpperCase(let[i]);
			}
			System.out.print(let[i]);
		}
		System.out.println("");
	}
}