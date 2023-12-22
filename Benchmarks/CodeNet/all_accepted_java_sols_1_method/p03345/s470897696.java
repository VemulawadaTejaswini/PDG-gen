import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		long A = Long.parseLong(strs[0]);
		long B = Long.parseLong(strs[1]);
		long C = Long.parseLong(strs[2]);
		long K = Long.parseLong(strs[3]);
		if(K%2==0){
			System.out.println(A-B);
		}else{
			System.out.println(-A+B);
		}
	}
}