

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n;i++){
			String[] s = br.readLine().split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j =0;j < s.length;j++){
				list.add(Integer.parseInt(s[j]));
			}
			Collections.sort(list);
			int a = list.get(0);
			int b = list.get(1);
			int c = list.get(2);
			if(a*a + b*b == c*c){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}	
		
		
	}

}