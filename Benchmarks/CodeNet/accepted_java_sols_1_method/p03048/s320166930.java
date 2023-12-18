

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int R = Integer.parseInt(sc.next());
		int G = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		int ans = 0;
		for(int r=0;r*R<=N;r++){
			for(int g=0;r*R+g*G<=N;g++){
				int sum = r*R+g*G;
				if((N-sum)%B==0)ans++;
			}
		}

		System.out.println(ans);
		
		
		sc.close();
	}
	
}
