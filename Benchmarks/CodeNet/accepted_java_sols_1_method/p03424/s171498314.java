import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Scanner s = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] S = new int[N];
		boolean flg = false;
		for(int i = 0;i < N;i++){
			flg |= s.next().equals("Y");
		}
		
		System.out.println(flg ? "Four" : "Three");
		
		
	}

}
