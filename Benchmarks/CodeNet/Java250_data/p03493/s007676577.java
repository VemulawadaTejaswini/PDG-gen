import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		char[] input=new Scanner(System.in).nextLine().toCharArray();
		int x=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]=='1') {
				x++;
			}
		}
		System.out.println(x);
	}
}