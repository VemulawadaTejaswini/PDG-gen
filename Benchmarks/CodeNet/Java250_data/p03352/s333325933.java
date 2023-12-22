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
		int max = 0;
		for(int i = 1; i < 32; i++){
			int m = i;
			for(int j = 2; j < 10; j++){
				m = m * i;
				if(max<=m && m<=n)
					max = m;
				if(m>n)
					break;
			}
			if(max<=m && m<=n)
				max = m;
		}
		System.out.println(max);
	}
}