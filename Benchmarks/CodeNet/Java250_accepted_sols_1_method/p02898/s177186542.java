import java.util.*;
import java.io.*;

public class Main{

	
	public static void main(String[] args){
	
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		int ans = 0;

		for(int i = 0;i < N;i++){
			int h = stdIn.nextInt();
			if(h >= K){
				ans++;
			}
		}

		System.out.println(ans);
	}
}
