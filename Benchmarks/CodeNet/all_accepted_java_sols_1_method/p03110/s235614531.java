import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		double[] x = new double [n];
		String[] u = new String [n];
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			x[i] = Double.parseDouble(str[0]);
			u[i] = str[1];
		}
		double cnt = 0;
		for(int i = 0; i < n; i++){
			if("JPY".equals(u[i])){
				cnt += 1.0*x[i];
			}else{
				cnt += 380000.0*x[i];
			}
		}
		System.out.println(cnt);

	}
}