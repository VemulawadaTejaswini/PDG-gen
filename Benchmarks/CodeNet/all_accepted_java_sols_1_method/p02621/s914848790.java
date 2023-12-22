
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.valueOf(br.readLine());
		int ans=(int)(n+Math.pow(n, 2)+Math.pow(n, 3));
		System.out.println(ans);
	}
}
