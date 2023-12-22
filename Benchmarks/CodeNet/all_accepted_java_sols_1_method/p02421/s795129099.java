import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		int n = Integer.parseInt(line1);
		int taro = 0;
		int hanako = 0;
		for (int i = 0; i<n ; i++ ) {
			String line = br.readLine();
			String[] str = line.split(" ");
			if (str[0].compareToIgnoreCase(str[1]) > 0) {
				taro = taro + 3;
			}else if (str[0].compareToIgnoreCase(str[1]) < 0){
				hanako = hanako + 3;
			}else{
				taro++;
				hanako++;
			}

		}
		System.out.println(taro + " " + hanako);
	}
}