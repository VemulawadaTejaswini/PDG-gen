import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		//入力(基本)
		String s = br.readLine();

		//文字列きりだし
		String new_str1 = s.substring(2, 5);

		System.out.print(s.substring(0, 4));
		System.out.print(" ");
		System.out.print(s.substring(4, 12));

		System.out.println("");             //画面表示

    }
}

