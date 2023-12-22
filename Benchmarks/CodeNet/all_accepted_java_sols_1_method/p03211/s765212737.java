import java.io.*;
import java.text.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		int min = 999;
		for (int i = 0; i < str.length() - 2; i++) {
			int temp = Integer.parseInt(str.substring(i, i + 3));
			temp = Math.abs(753 - temp);
			min = min > temp ? temp : min;
		}
		System.out.println(min);
	}

}
