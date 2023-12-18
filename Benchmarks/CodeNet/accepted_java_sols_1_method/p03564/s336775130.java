import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int num = 1;
		for(int i = 0; i < N; i++){
			num = Math.min(num+K,num*2);
		}
		System.out.println(num);
	}
}