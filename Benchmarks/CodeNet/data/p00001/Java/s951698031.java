import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] mountain = new int[10];
		for(int i = 0;i<10;i++){
			mountain[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(mountain);
		for(int i = 0;i<3;i++){
			System.out.println(mountain[9-i]);
		}
	}
}